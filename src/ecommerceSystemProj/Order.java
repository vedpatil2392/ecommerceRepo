package ecommerceSystemProj;

import java.util.Date;
import java.util.List;

class Order implements OrderActions {
    private String orderId;
    private String customerId;
    private Date orderDate;
    private String orderStatus;
    private List<Product> orderedProducts;

    public Order(String orderId, String customerId, Date orderDate, List<Product> orderedProducts) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.orderedProducts = orderedProducts;
        this.orderStatus = "Pending";
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed for customer " + customerId);
        // Additional implementation for placing an order
    }

    @Override
    public void cancelOrder() {
        this.orderStatus = "Cancelled";
        System.out.println("Order " + orderId + " cancelled.");
    }

    @Override
    public void trackOrder() {
        System.out.println("Order " + orderId + " is currently " + orderStatus);
    }

    public void getOrderDetails() {
        System.out.println("Order Details for " + orderId);
        // Additional implementation for displaying order details
    }
}



