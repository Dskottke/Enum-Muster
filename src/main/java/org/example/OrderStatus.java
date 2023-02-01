package org.example;

public enum OrderStatus {
    RECEIVED("received"),
    IN_PROGRESS("in progress"),
    IN_DELIVERY("in delivery"),
    COMPLETED("completed"),
    CANCELLED("cancelled");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "description='" + description + '\'' +
                "} " + super.toString();
    }
}


