//package com.example.kafka.service;
//import com.example.kafka.model.Order;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ProcessedOrderConsumer {
//
//    @KafkaListener(topics = "processed-orders-topic", groupId = "processed-order-group")
//    public void consumeProcessedOrder(Order order) {
//        System.out.println("Consumed processed order: " + order);
//    }
//}
//
