package com.example.kafka.service;

import com.example.kafka.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "raw-order-consumer", groupId = "order-group")
    public void processOrder(Order order) {
        System.out.println("in order consumer");
        System.out.println("Received Order: " + order.getId() + ", Amount: " + order.getAmount());
    }
}
