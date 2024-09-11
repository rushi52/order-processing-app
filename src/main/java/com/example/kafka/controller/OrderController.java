package com.example.kafka.controller;

import com.example.kafka.model.Order;
import com.example.kafka.service.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer=orderProducer;
    }

    @PostMapping("/orders")
    public void createOrder(@RequestBody Order order) {
        System.out.println("in order controller");
        orderProducer.sendRawOrder(order);

    }
    @PostMapping("/totalamount")
    public void findTotalAmountInOrder(@RequestBody Order order){
        System.out.println("finding toatal amount");
        orderProducer.sendProcessedOrder(order);


    }
}

