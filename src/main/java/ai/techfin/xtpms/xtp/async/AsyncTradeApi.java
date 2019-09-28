package ai.techfin.xtpms.xtp.async;

import ai.techfin.tradesystem.config.KafkaTopicConfiguration;
import ai.techfin.xtpms.service.broker.dto.OrderResponseDTO;
import ai.techfin.xtpms.service.broker.dto.TradeResponseDTO;
import ai.techfin.xtpms.service.broker.mapper.OrderRespDTOMapper;
import ai.techfin.xtpms.service.broker.mapper.TradeRespDTOMapper;
import ai.techfin.xtpms.utils.UserBlockingQueue;
import com.zts.xtp.common.enums.*;
import com.zts.xtp.common.model.ErrorMessage;
import com.zts.xtp.trade.api.TradeApi;
import com.zts.xtp.trade.model.request.OrderInsertRequest;
import com.zts.xtp.trade.model.response.AssetResponse;
import com.zts.xtp.trade.model.response.OrderResponse;
import com.zts.xtp.trade.model.response.TradeResponse;
import com.zts.xtp.trade.spi.TradeSpi;
import net.logstash.logback.encoder.org.apache.commons.lang3.tuple.ImmutablePair;
import net.logstash.logback.encoder.org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@PropertySource("classpath:config/xtp.properties")
@Component("asyncTradeApi")
@Lazy
public class AsyncTradeApi implements TradeSpi, InitializingBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncTradeApi.class);

    private final TradeApi tradeApi;

    private final String XTP_TRADE_SERVER_IP;

    private final int XTP_TRADE_SERVER_PORT;

    private final String TRADE_KEY;

    private final String LOG_FOLDER;

    public static short clientId;

    private final KafkaTemplate<String, OrderResponseDTO> kafkaTemplateOrderRes;

    private final KafkaTemplate<String, TradeResponseDTO> kafkaTemplateTradeRes;

    private final UserBlockingQueue userBlockingQueue;

    private final ConcurrentHashMap<String, Pair<String, String>> sessionIdWithUser = new ConcurrentHashMap<>();

    private final ConcurrentHashMap<String, String> userWithSessionId = new ConcurrentHashMap<>();

    private final OrderRespDTOMapper orderRespDTOMapper;

    private final TradeRespDTOMapper tradeRespDTOMapper;

    @Autowired
    public AsyncTradeApi(@Value("${logFolder}") String LOG_FOLDER,
                         @Value("${tradeServerIP}") String XTP_TRADE_SERVER_IP,
                         @Value("${tradeServerPort}") int XTP_TRADE_SERVER_PORT,
                         @Value("${tradeKey}") String TRADE_KEY,
                         KafkaTemplate<String, OrderResponseDTO> kafkaTemplateOrderRes,
                         KafkaTemplate<String, TradeResponseDTO> kafkaTemplateTradeRes,
                         OrderRespDTOMapper orderRespDTOMapper,
                         TradeRespDTOMapper tradeRespDTOMapper) {
        this.XTP_TRADE_SERVER_IP = XTP_TRADE_SERVER_IP;
        this.XTP_TRADE_SERVER_PORT = XTP_TRADE_SERVER_PORT;
        this.TRADE_KEY = TRADE_KEY;
        this.LOG_FOLDER = LOG_FOLDER;
        tradeApi = new TradeApi(this);
        this.kafkaTemplateOrderRes = kafkaTemplateOrderRes;
        this.kafkaTemplateTradeRes = kafkaTemplateTradeRes;
        this.orderRespDTOMapper = orderRespDTOMapper;
        this.tradeRespDTOMapper = tradeRespDTOMapper;
        this.userBlockingQueue = new UserBlockingQueue(false, new LinkedBlockingQueue<>());
        LOGGER.info("AsyncTradeApi Bean Constructor start ");
    }


    public boolean sellOrBuy(OrderInsertRequest request, String user) {
        String sessionId = userWithSessionId.get(user);
        if (sessionId == null || sessionId.equals("0")) {
            if (request.getSideType() == SideType.XTP_SIDE_SELL.type) {
                LOGGER.info("sell error , reason : user {} not login", user);
            } else {
                LOGGER.info("buy error , reason : user {} not login", user);
            }
            return false;
        }

        try {
            userBlockingQueue.getUserRequestQueue().put(request);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        insertOrder(userBlockingQueue, sessionId);
        return true;
    }

    @Async
    public void insertOrder(UserBlockingQueue userBlockingQueue, String sessionId) {
        OrderInsertRequest request = null;
        if (!userBlockingQueue.isWork() && userBlockingQueue.getUserRequestQueue().size() > 0) {
            userBlockingQueue.setWork(true);
            while (userBlockingQueue.isWork()) {
                try {
                    //最多等待1秒，request = null 时改变状态work = false
                    request = userBlockingQueue.getUserRequestQueue().poll(1L, TimeUnit.SECONDS);
                    if (request == null) {
                        userBlockingQueue.setWork(false);
                    } else {
                        tradeApi.insertOrder(request, sessionId);
                    }
                } catch (InterruptedException e) {
                    LOGGER.info("insertOrder error, sessionId : {}, reason : {}", sessionId, e.getMessage());
                }
            }
        }
    }

    @Async
    public void login(String user, String password) {
        String sessionId = "";
        sessionId = tradeApi.login(XTP_TRADE_SERVER_IP, XTP_TRADE_SERVER_PORT, user, password, TransferProtocol.XTP_PROTOCOL_TCP);
        if (sessionId.equals("0")) {
            LOGGER.info("user : {} login failed ，reason : {} ", user, tradeApi.getApiLastError());
        } else {
            sessionIdWithUser.put(sessionId, new ImmutablePair<>(user, password));
            userWithSessionId.put(user, sessionId);
            LOGGER.info("user : {} login success, sessionId : {} ", user, sessionId);
        }
    }

    @Override
    public void onDisconnect(String sessionId, int reason) {
        LOGGER.info("sessionId : {} disConnect , reason : {} ", sessionId, reason);
        Pair<String, String> pair = sessionIdWithUser.get(sessionId);
        final String user = pair.getLeft();
        final String password = pair.getRight();
        String result = "";
        do {
            result = tradeApi.login(XTP_TRADE_SERVER_IP, XTP_TRADE_SERVER_PORT, user, password, TransferProtocol.XTP_PROTOCOL_TCP);
        } while (result == null || result.equals("0"));

        //user replace sessionId
        userWithSessionId.put(user, result);
        sessionIdWithUser.put(result, pair);
        sessionIdWithUser.remove(sessionId);
        LOGGER.info("user replace sessionId, lastTime : {}, now :{}", sessionId, result);
    }

    /**
     * Xtp init初始化，在创容器创建AsyncTradeApi后调用，此对象lazy加载
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        clientId = (short) Math.floor((Math.random() * 5) + 1);
        tradeApi.init(clientId, TRADE_KEY,
                LOG_FOLDER, XtpLogLevel.XTP_LOG_LEVEL_ERROR, JniLogLevel.JNI_LOG_LEVEL_ERROR,
                XtpTeResumeType.XTP_TERT_QUICK);
        tradeApi.setHeartBeatInterval(180);
        LOGGER.info("tradeApi init");
    }

    /**
     * 查询用户资金
     *
     * @param sessionId 用户登录后的参数
     */
    @Async
    public void queryAsset(String sessionId) {
        tradeApi.queryAsset(sessionId, 0);
        LOGGER.info("queryUserAsset , user sessionId : {}", sessionId);
    }

    @Override
    public void onQueryAsset(AssetResponse assetInfo, ErrorMessage errorMessage, String sessionId) {
        LOGGER.info("sessionId : {}, AssetInfo :{} ", sessionId, assetInfo);
    }


    @Override
    public void onOrderEvent(OrderResponse orderInfo, ErrorMessage errorMessage, String sessionId) {
        if (orderInfo.getOrderStatusType() == OrderStatusType.XTP_ORDER_STATUS_REJECTED) {
            OrderResponseDTO orderResponseDTO = orderRespDTOMapper.orderToOrderDTO(orderInfo, errorMessage);
            orderResponseDTO.setUser(sessionIdWithUser.get(sessionId).getLeft());
            kafkaTemplateOrderRes.send(KafkaTopicConfiguration.XTP_TRADE_FAILED, orderResponseDTO);
        }
        LOGGER.info("orderEvent : sessionId  {}, orderInfo {}", sessionId, orderInfo);
    }

    @Override
    public void onTradeEvent(TradeResponse tradeInfo, String sessionId) {
        TradeResponseDTO tradeResponseDTO = tradeRespDTOMapper.tradeToTradeDTO(tradeInfo);
        tradeResponseDTO.setUser(sessionIdWithUser.get(sessionId).getLeft());
        kafkaTemplateTradeRes.send(KafkaTopicConfiguration.XTP_TRADE_SUCCEED, tradeResponseDTO);
        LOGGER.info("tradeEvent : sessionId  {}, tradeInfo {}", sessionId, tradeInfo);
    }
}
