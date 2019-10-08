// Generated by delombok at Sun Sep 22 21:37:46 CST 2019
package com.zts.xtp.trade.model.response;

import com.zts.xtp.common.enums.BusinessType;
import com.zts.xtp.common.enums.MarketType;
import com.zts.xtp.common.enums.PositionEffectType;
import com.zts.xtp.common.enums.SideType;

public class TradeResponse {
    /**
     * XTP系统订单ID，此成交回报相关的订单ID，在XTP系统中唯一
     */
    private String orderXtpId;
    /**
     * 报单引用
     */
    private int orderClientId;
    /**
     * 合约代码
     */
    private String ticker;
    /**
     * 交易市场
     */
    private MarketType marketType;
    /**
     * 订单号，引入XTPID后，该字段实际和order_xtp_id重复。接口中暂时保留
     */
    private String localOrderId;
    /**
     * 成交编号，深交所唯一，上交所每笔交易唯一，当发现2笔成交回报拥有相同的exec_id，则可以认为此笔交易自成交
     */
    private String execId;
    /**
     * 价格，此次成交的价格
     */
    private double price;
    /**
     * 数量，此次成交的数量，不是累计数量
     */
    private long quantity;
    /**
     * 成交时间，格式为YYYYMMDDHHMMSSsss
     */
    private long tradeTime;
    /**
     * 成交金额，此次成交的总金额 = price*quantity
     */
    private double tradeAmount;
    /**
     * 成交序号 –回报记录号，每个交易所唯一,report_index+market字段可以组成唯一标识表示成交回报
     */
    private String reportIndex;
    /**
     * 报单编号 –交易所单号，上交所为空，深交所有此字段
     */
    private String orderExchId;
    /**
     * 成交类型 –成交回报中的执行类型
     */
    private char tradeType;
    /**
     * 买卖方向
     */
    private SideType sideType;
    /**
     * 开平标志
     */
    private PositionEffectType positionEffectType;
    /**
     * 业务类型
     */
    private BusinessType businessType;
    /**
     * 交易所交易员代码
     */
    private String branchPbu;
    /**
     * 此消息响应函数对应的请求ID
     */
    private int requestId;
    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    private boolean lastResp;

    public void setMarketType(int type) {
        marketType = MarketType.values()[type];
    }

    public void setSideType(int type) {
        sideType = SideType.forType(type);
    }

    public void setPositionEffectType(int type) {
        if (PositionEffectType.values().length - 1 < type) {
            positionEffectType = PositionEffectType.XTP_POSITION_EFFECT_UNKNOWN;
            System.err.println("Error: received PositionEffectType value exceed positionEffectType enum size, receive=" + type);
        } else {
            positionEffectType = PositionEffectType.values()[type];
        }
    }

    public void setBusinessType(int type) {
        businessType = BusinessType.values()[type];
    }


    @SuppressWarnings("all")
    public static class TradeResponseBuilder {
        @SuppressWarnings("all")
        private String orderXtpId;
        @SuppressWarnings("all")
        private int orderClientId;
        @SuppressWarnings("all")
        private String ticker;
        @SuppressWarnings("all")
        private MarketType marketType;
        @SuppressWarnings("all")
        private String localOrderId;
        @SuppressWarnings("all")
        private String execId;
        @SuppressWarnings("all")
        private double price;
        @SuppressWarnings("all")
        private long quantity;
        @SuppressWarnings("all")
        private long tradeTime;
        @SuppressWarnings("all")
        private double tradeAmount;
        @SuppressWarnings("all")
        private String reportIndex;
        @SuppressWarnings("all")
        private String orderExchId;
        @SuppressWarnings("all")
        private char tradeType;
        @SuppressWarnings("all")
        private SideType sideType;
        @SuppressWarnings("all")
        private PositionEffectType positionEffectType;
        @SuppressWarnings("all")
        private BusinessType businessType;
        @SuppressWarnings("all")
        private String branchPbu;
        @SuppressWarnings("all")
        private int requestId;
        @SuppressWarnings("all")
        private boolean lastResp;

        @SuppressWarnings("all")
        TradeResponseBuilder() {
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder orderXtpId(final String orderXtpId) {
            this.orderXtpId = orderXtpId;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder orderClientId(final int orderClientId) {
            this.orderClientId = orderClientId;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder marketType(final MarketType marketType) {
            this.marketType = marketType;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder localOrderId(final String localOrderId) {
            this.localOrderId = localOrderId;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder execId(final String execId) {
            this.execId = execId;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder price(final double price) {
            this.price = price;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder quantity(final long quantity) {
            this.quantity = quantity;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder tradeTime(final long tradeTime) {
            this.tradeTime = tradeTime;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder tradeAmount(final double tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder reportIndex(final String reportIndex) {
            this.reportIndex = reportIndex;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder orderExchId(final String orderExchId) {
            this.orderExchId = orderExchId;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder tradeType(final char tradeType) {
            this.tradeType = tradeType;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder sideType(final SideType sideType) {
            this.sideType = sideType;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder positionEffectType(final PositionEffectType positionEffectType) {
            this.positionEffectType = positionEffectType;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder businessType(final BusinessType businessType) {
            this.businessType = businessType;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder branchPbu(final String branchPbu) {
            this.branchPbu = branchPbu;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder requestId(final int requestId) {
            this.requestId = requestId;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponseBuilder lastResp(final boolean lastResp) {
            this.lastResp = lastResp;
            return this;
        }

        @SuppressWarnings("all")
        public TradeResponse build() {
            return new TradeResponse(orderXtpId, orderClientId, ticker, marketType, localOrderId, execId, price, quantity, tradeTime, tradeAmount, reportIndex, orderExchId, tradeType, sideType, positionEffectType, businessType, branchPbu, requestId, lastResp);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "TradeResponse.TradeResponseBuilder(orderXtpId=" + this.orderXtpId + ", orderClientId=" + this.orderClientId + ", ticker=" + this.ticker + ", marketType=" + this.marketType + ", localOrderId=" + this.localOrderId + ", execId=" + this.execId + ", price=" + this.price + ", quantity=" + this.quantity + ", tradeTime=" + this.tradeTime + ", tradeAmount=" + this.tradeAmount + ", reportIndex=" + this.reportIndex + ", orderExchId=" + this.orderExchId + ", tradeType=" + this.tradeType + ", sideType=" + this.sideType + ", positionEffectType=" + this.positionEffectType + ", businessType=" + this.businessType + ", branchPbu=" + this.branchPbu + ", requestId=" + this.requestId + ", lastResp=" + this.lastResp + ")";
        }
    }

    @SuppressWarnings("all")
    public static TradeResponseBuilder builder() {
        return new TradeResponseBuilder();
    }

    /**
     * XTP系统订单ID，此成交回报相关的订单ID，在XTP系统中唯一
     */
    @SuppressWarnings("all")
    public String getOrderXtpId() {
        return this.orderXtpId;
    }

    /**
     * 报单引用
     */
    @SuppressWarnings("all")
    public int getOrderClientId() {
        return this.orderClientId;
    }

    /**
     * 合约代码
     */
    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    /**
     * 交易市场
     */
    @SuppressWarnings("all")
    public MarketType getMarketType() {
        return this.marketType;
    }

    /**
     * 订单号，引入XTPID后，该字段实际和order_xtp_id重复。接口中暂时保留
     */
    @SuppressWarnings("all")
    public String getLocalOrderId() {
        return this.localOrderId;
    }

    /**
     * 成交编号，深交所唯一，上交所每笔交易唯一，当发现2笔成交回报拥有相同的exec_id，则可以认为此笔交易自成交
     */
    @SuppressWarnings("all")
    public String getExecId() {
        return this.execId;
    }

    /**
     * 价格，此次成交的价格
     */
    @SuppressWarnings("all")
    public double getPrice() {
        return this.price;
    }

    /**
     * 数量，此次成交的数量，不是累计数量
     */
    @SuppressWarnings("all")
    public long getQuantity() {
        return this.quantity;
    }

    /**
     * 成交时间，格式为YYYYMMDDHHMMSSsss
     */
    @SuppressWarnings("all")
    public long getTradeTime() {
        return this.tradeTime;
    }

    /**
     * 成交金额，此次成交的总金额 = price*quantity
     */
    @SuppressWarnings("all")
    public double getTradeAmount() {
        return this.tradeAmount;
    }

    /**
     * 成交序号 –回报记录号，每个交易所唯一,report_index+market字段可以组成唯一标识表示成交回报
     */
    @SuppressWarnings("all")
    public String getReportIndex() {
        return this.reportIndex;
    }

    /**
     * 报单编号 –交易所单号，上交所为空，深交所有此字段
     */
    @SuppressWarnings("all")
    public String getOrderExchId() {
        return this.orderExchId;
    }

    /**
     * 成交类型 –成交回报中的执行类型
     */
    @SuppressWarnings("all")
    public char getTradeType() {
        return this.tradeType;
    }

    /**
     * 买卖方向
     */
    @SuppressWarnings("all")
    public SideType getSideType() {
        return this.sideType;
    }

    /**
     * 开平标志
     */
    @SuppressWarnings("all")
    public PositionEffectType getPositionEffectType() {
        return this.positionEffectType;
    }

    /**
     * 业务类型
     */
    @SuppressWarnings("all")
    public BusinessType getBusinessType() {
        return this.businessType;
    }

    /**
     * 交易所交易员代码
     */
    @SuppressWarnings("all")
    public String getBranchPbu() {
        return this.branchPbu;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public int getRequestId() {
        return this.requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public boolean isLastResp() {
        return this.lastResp;
    }

    /**
     * XTP系统订单ID，此成交回报相关的订单ID，在XTP系统中唯一
     */
    @SuppressWarnings("all")
    public void setOrderXtpId(final String orderXtpId) {
        this.orderXtpId = orderXtpId;
    }

    /**
     * 报单引用
     */
    @SuppressWarnings("all")
    public void setOrderClientId(final int orderClientId) {
        this.orderClientId = orderClientId;
    }

    /**
     * 合约代码
     */
    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    /**
     * 订单号，引入XTPID后，该字段实际和order_xtp_id重复。接口中暂时保留
     */
    @SuppressWarnings("all")
    public void setLocalOrderId(final String localOrderId) {
        this.localOrderId = localOrderId;
    }

    /**
     * 成交编号，深交所唯一，上交所每笔交易唯一，当发现2笔成交回报拥有相同的exec_id，则可以认为此笔交易自成交
     */
    @SuppressWarnings("all")
    public void setExecId(final String execId) {
        this.execId = execId;
    }

    /**
     * 价格，此次成交的价格
     */
    @SuppressWarnings("all")
    public void setPrice(final double price) {
        this.price = price;
    }

    /**
     * 数量，此次成交的数量，不是累计数量
     */
    @SuppressWarnings("all")
    public void setQuantity(final long quantity) {
        this.quantity = quantity;
    }

    /**
     * 成交时间，格式为YYYYMMDDHHMMSSsss
     */
    @SuppressWarnings("all")
    public void setTradeTime(final long tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * 成交金额，此次成交的总金额 = price*quantity
     */
    @SuppressWarnings("all")
    public void setTradeAmount(final double tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * 成交序号 –回报记录号，每个交易所唯一,report_index+market字段可以组成唯一标识表示成交回报
     */
    @SuppressWarnings("all")
    public void setReportIndex(final String reportIndex) {
        this.reportIndex = reportIndex;
    }

    /**
     * 报单编号 –交易所单号，上交所为空，深交所有此字段
     */
    @SuppressWarnings("all")
    public void setOrderExchId(final String orderExchId) {
        this.orderExchId = orderExchId;
    }

    /**
     * 成交类型 –成交回报中的执行类型
     */
    @SuppressWarnings("all")
    public void setTradeType(final char tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 交易所交易员代码
     */
    @SuppressWarnings("all")
    public void setBranchPbu(final String branchPbu) {
        this.branchPbu = branchPbu;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public void setRequestId(final int requestId) {
        this.requestId = requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public void setLastResp(final boolean lastResp) {
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "TradeResponse(orderXtpId=" + this.getOrderXtpId() + ", orderClientId=" + this.getOrderClientId() + ", ticker=" + this.getTicker() + ", marketType=" + this.getMarketType() + ", localOrderId=" + this.getLocalOrderId() + ", execId=" + this.getExecId() + ", price=" + this.getPrice() + ", quantity=" + this.getQuantity() + ", tradeTime=" + this.getTradeTime() + ", tradeAmount=" + this.getTradeAmount() + ", reportIndex=" + this.getReportIndex() + ", orderExchId=" + this.getOrderExchId() + ", tradeType=" + this.getTradeType() + ", sideType=" + this.getSideType() + ", positionEffectType=" + this.getPositionEffectType() + ", businessType=" + this.getBusinessType() + ", branchPbu=" + this.getBranchPbu() + ", requestId=" + this.getRequestId() + ", lastResp=" + this.isLastResp() + ")";
    }

    @SuppressWarnings("all")
    public TradeResponse() {
    }

    @SuppressWarnings("all")
    public TradeResponse(final String orderXtpId, final int orderClientId, final String ticker, final MarketType marketType, final String localOrderId, final String execId, final double price, final long quantity, final long tradeTime, final double tradeAmount, final String reportIndex, final String orderExchId, final char tradeType, final SideType sideType, final PositionEffectType positionEffectType, final BusinessType businessType, final String branchPbu, final int requestId, final boolean lastResp) {
        this.orderXtpId = orderXtpId;
        this.orderClientId = orderClientId;
        this.ticker = ticker;
        this.marketType = marketType;
        this.localOrderId = localOrderId;
        this.execId = execId;
        this.price = price;
        this.quantity = quantity;
        this.tradeTime = tradeTime;
        this.tradeAmount = tradeAmount;
        this.reportIndex = reportIndex;
        this.orderExchId = orderExchId;
        this.tradeType = tradeType;
        this.sideType = sideType;
        this.positionEffectType = positionEffectType;
        this.businessType = businessType;
        this.branchPbu = branchPbu;
        this.requestId = requestId;
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TradeResponse)) return false;
        final TradeResponse other = (TradeResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderXtpId = this.getOrderXtpId();
        final Object other$orderXtpId = other.getOrderXtpId();
        if (this$orderXtpId == null ? other$orderXtpId != null : !this$orderXtpId.equals(other$orderXtpId)) return false;
        if (this.getOrderClientId() != other.getOrderClientId()) return false;
        final Object this$ticker = this.getTicker();
        final Object other$ticker = other.getTicker();
        if (this$ticker == null ? other$ticker != null : !this$ticker.equals(other$ticker)) return false;
        final Object this$marketType = this.getMarketType();
        final Object other$marketType = other.getMarketType();
        if (this$marketType == null ? other$marketType != null : !this$marketType.equals(other$marketType)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof TradeResponse;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderXtpId = this.getOrderXtpId();
        result = result * PRIME + ($orderXtpId == null ? 43 : $orderXtpId.hashCode());
        result = result * PRIME + this.getOrderClientId();
        final Object $ticker = this.getTicker();
        result = result * PRIME + ($ticker == null ? 43 : $ticker.hashCode());
        final Object $marketType = this.getMarketType();
        result = result * PRIME + ($marketType == null ? 43 : $marketType.hashCode());
        return result;
    }
}