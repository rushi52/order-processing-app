//package com.example.kafka.service;
//
//import com.example.kafka.model.Order;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TotalAmountService {
//
//    public static Order calculateTotalAmount(Order order) {
//        double totalAmount = order.getItems().stream()
//                .mapToDouble(item -> item.getPrice() * item.getQuantity())
//                .sum();
//        order.setAmount(totalAmount);
//        return order;
//    }
//}
