package com.gmail.stepan1983.DTO;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Shipment;

import java.util.Date;

public class OrderDTO {

    private long id;

    private long[] orderListIds;

    private double orderPrice;

    private ClientDTO client;

    private long shipmentId;

    private String status;

    private Date orderDate;

    public OrderDTO(long id, long[] orderListIds,
                    double orderPrice, ClientDTO client,
                    long shipmentId, String status,
                    Date orderDate) {
        this.id = id;
        this.orderListIds = orderListIds;
        this.orderPrice = orderPrice;
        this.client = client;
        this.shipmentId = shipmentId;
        this.status = status;
        this.orderDate = orderDate;
    }

    public OrderDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long[] getOrderListIds() {
        return orderListIds;
    }

    public void setOrderListIds(long[] orderListIds) {
        this.orderListIds = orderListIds;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public long getShipment() {
        return shipmentId;
    }

    public void setShipment(long shipmentId) {
        this.shipmentId = shipmentId;
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
