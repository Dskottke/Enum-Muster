package org.example;

public class Main {
    public static void main(String[] args) {
      
        Order order = new Order("123", OrderStatus.COMPLETED);

      switch (order.getStatus()){
            case RECEIVED:
                System.out.println("Order received");
                break;
            case IN_PROGRESS:
                System.out.println("Order in progress");
                break;
            case IN_DELIVERY:
                System.out.println("Order in delivery");
                break;
            case COMPLETED:
                System.out.println("Order completed");
                break;
            case CANCELLED:
                System.out.println("Order cancelled");
                break;
      }
    }
}