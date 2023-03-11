package com.samson.simple_kafka_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SimpleKafkaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleKafkaApiApplication.class, args);
    }

    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            kafkaTemplate.send("myNewTopic", "Hello Everyone, this is my first kafka topic");
        };
    }
}
