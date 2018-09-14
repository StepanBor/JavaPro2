package com.gmail.stepan1983.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    private long id;

    private List<BookItemDTO> orderList;

    private double orderPrice;

    private ClientDTO client;

    private long shipmentId;

    private String status;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date orderDate;

    public OrderDTO(long id, List<BookItemDTO> orderList,
                    double orderPrice, ClientDTO client,
                    long shipmentId, String status,
                    Date orderDate) {
        this.id = id;
        this.orderList = orderList;
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

    public List<BookItemDTO> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<BookItemDTO> orderList) {
        this.orderList = orderList;
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
