package com.gmail.stepan1983.model;

import javax.persistence.*;

@Entity
@Table(name = "Shipment1")
public class Shipment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String shippingAddress;

    private String shipmentStatus;

    public Shipment(String shippingAddress, String shipmentStatus) {
        this.shippingAddress = shippingAddress;
        this.shipmentStatus = shipmentStatus;
    }

    public Shipment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }
}
