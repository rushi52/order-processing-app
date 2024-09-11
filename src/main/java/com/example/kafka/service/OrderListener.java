//package com.example.kafka.service;
//import com.example.kafka.model.Order;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class OrderListener {
//
//    @KafkaListener(topics = "processed-order-topic", groupId = "order-consumer-group")
//    public void consumeProcessedOrder(Order order) {
//        System.out.println("Processed Order Received: " + order);
////
//    }
//}
//
