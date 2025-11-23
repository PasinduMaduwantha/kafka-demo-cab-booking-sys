package com.devpasindudemo.cab_book_driver_kafka_demo.config;

import com.devpasindudemo.cab_book_driver_kafka_demo.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(AppConstant.CAB_LOCATION_TOPIC)
                .build();
    }
}
