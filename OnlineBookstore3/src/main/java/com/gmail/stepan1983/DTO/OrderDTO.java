package com.gmail.stepan1983.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    private long id;

    private List<BookItemDTO> orderList;

    private double orderPrice;

    private ClientDTO client;

    private ShipmentDTO shipment;

    private String status;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date orderDate;

    public OrderDTO(long id, List<BookItemDTO> orderList,
                    double orderPrice, ClientDTO client,
                    ShipmentDTO shipment, String status,
                    Date orderDate) {
        this.id = id;
        this.orderList = orderList;
        this.orderPrice = orderPrice;
        this.client = client;
        this.shipment = shipment;
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

    public ShipmentDTO getShipment() {
        return shipment;
    }

    public void setShipment(ShipmentDTO shipmentId) {
        this.shipment = shipmentId;
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

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
//                ", orderList=" + orderList +
                ", orderPrice=" + orderPrice +
                ", client=" + client +
                ", shipment=" + shipment +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
