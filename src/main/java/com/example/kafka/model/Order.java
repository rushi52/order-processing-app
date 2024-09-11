package com.example.kafka.model;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    private String id;
    private List<Item> items;
    private double amount;

    public Order() {
    }

    public Order(String id, List<Item> items, double amount) {
        this.id = id;
        this.items = items;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    // Constructors, Getters, Setters
}