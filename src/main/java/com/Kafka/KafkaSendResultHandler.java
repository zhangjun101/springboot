package com.Kafka;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

/**
 * 这里要注意ProducerListener版本问题，spring-kafka依赖要引入高版本
 * */
@Component
public class KafkaSendResultHandler implements ProducerListener {

    private static final Logger log = LoggerFactory.getLogger(KafkaSendResultHandler.class);

    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {
        log.info("Message send success : " + producerRecord.toString());
    }

    @Override
    public void onError(ProducerRecord producerRecord, Exception exception) {
        log.info("Message send error : " + producerRecord.toString());
    }
}

//@Component
//public class KafkaSendResultHandler implements ProducerListener {
//
//    private static final Logger log = LoggerFactory.getLogger(KafkaSendResultHandler.class);
//
//    @Override
//    public void onSuccess(String s, Integer integer, Object o, Object o2, RecordMetadata recordMetadata) {
//        log.info("Message send success : s=" + s);
//        log.info("Message send success : integer=" + integer);
//        log.info("Message send success : o=" + o.toString());
//        log.info("Message send success : recordMetadata=" + recordMetadata.toString());
//    }
//
//    @Override
//    public void onError(String s, Integer integer, Object o, Object o2, Exception e) {
//        log.info("Message send success : s=" + s);
//        log.info("Message send success : integer=" + integer);
//        log.info("Message send success : o=" + o.toString());
//        log.info("Message send success : e=" + e.toString());
//    }
//
//    @Override
//    public boolean isInterestedInSuccess() {
//        return false;
//    }
//}