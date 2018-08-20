package com.gmail.stepan1983.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Orders1")
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<BookItem> orderList;

    private double orderPrice;

    @OneToOne
    private Client client;

    @OneToOne
    private Shipment shipment;

    private String status;

    public Order(List<BookItem> orderList, double orderPrice, Client client, Shipment shipment, String status) {
        this.orderList = orderList;
        this.orderPrice = orderPrice;
        this.client = client;
        this.shipment = shipment;
        this.status = status;
    }

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<BookItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<BookItem> orderList) {
        this.orderList = orderList;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
