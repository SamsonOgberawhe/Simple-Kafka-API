package com.samson.simple_kafka_api;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "myNewTopic", groupId = "myId")
    void listener(String data){
        System.out.println("Listener received " + data);

    }
}
