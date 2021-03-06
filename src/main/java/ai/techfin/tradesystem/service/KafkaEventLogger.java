package ai.techfin.tradesystem.service;

import ai.techfin.tradesystem.config.KafkaTopicConfiguration;
import ai.techfin.tradesystem.service.dto.PriceUpdateDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaEventLogger {

    private final Logger log = LoggerFactory.getLogger(KafkaEventLogger.class);

    @KafkaListener(topics = KafkaTopicConfiguration.XTP_PRICE_CHANGE_TOPIC, groupId = "trade-system")
    public void consume(PriceUpdateDTO message) {
        log.debug("Consumed message in {} : {}", KafkaTopicConfiguration.XTP_PRICE_CHANGE_TOPIC, message);
    }

}
