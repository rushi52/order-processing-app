//package com.example.kafka.service;
//
//import com.example.kafka.model.Order;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RawOrderListener {
//
//    @KafkaListener(topics = "raw-order-topic", groupId = "raw-order-consumer-group")
//    public void consumeRawOrder(Order order) {
//        System.out.println("Raw Order Received: " + order);
//
//    }
//}
