package com.gmail.stepan1983.model;


import javax.persistence.*;
import java.util.Date;
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

    @Temporal(value = TemporalType.DATE)
    private Date orderDate;

    public Order(List<BookItem> orderList, Client client,
                 Shipment shipment, String status, Date orderDate) {
        this.orderList = orderList;

        for (BookItem bookItem : orderList) {
            this.orderPrice+=bookItem.getPrice();
        }

        this.client = client;
        this.shipment = shipment;
        this.status = status;
        this.orderDate=orderDate;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
