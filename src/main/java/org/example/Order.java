package org.example;

public class Order {
    private String id;
    private OrderStatus status;

    public Order(String id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

}

