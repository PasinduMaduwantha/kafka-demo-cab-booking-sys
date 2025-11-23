package com.devpasindudemo.cab_book_driver_kafka_demo.service;

import com.devpasindudemo.cab_book_driver_kafka_demo.constant.AppConstant;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    private final KafkaTemplate<String,Object> kafkaTemplate;

    public CabLocationService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void updateLocation(String location) {
        kafkaTemplate.send(AppConstant.CAB_LOCATION_TOPIC, location);
    }
}
