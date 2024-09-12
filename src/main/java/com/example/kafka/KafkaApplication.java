package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
public class KafkaApplication {
    public static void main(String[] args) {

        SpringApplication.run(KafkaApplication.class, args);
    }
}
