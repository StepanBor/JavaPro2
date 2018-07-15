package com.gmail.stepan1983;

public class Order {

    private Client client;
    private Product product;

    private int orderId;

    public Order(Client client, Product product, int orderId) {
        this.client = client;
        this.product = product;
        this.orderId=orderId;
    }

    public Order() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", product=" + product +
                '}';
    }
}
