package com.example.kafka.service;

import com.example.kafka.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
//
//@Service
////public class OrderProducer {
//
//    @Autowired
//    private KafkaTemplate<String, Order> kafkaTemplate;
//
//    public void sendOrder(@RequestBody Order order) {
//        System.out.println("in order producer");
//        kafkaTemplate.send("orders-topic", order);
//    }
//
//
//}

@Service
public class OrderProducer {

    private static final String RAW_ORDER_TOPIC = "raw-order-topic";
    private static final String PROCESSED_ORDER_TOPIC = "order-processed-topic";

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;


    public void sendRawOrder(Order order) {
        kafkaTemplate.send(RAW_ORDER_TOPIC, order);
    }


    public void sendProcessedOrder(Order order) {
        kafkaTemplate.send(PROCESSED_ORDER_TOPIC, order);
    }
}

