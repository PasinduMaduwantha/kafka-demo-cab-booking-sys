package com.devpasindudemo.cab_book_user_kafka_demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private static final Logger log = LoggerFactory.getLogger(LocationService.class);

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        log.info(location);
    }
}
