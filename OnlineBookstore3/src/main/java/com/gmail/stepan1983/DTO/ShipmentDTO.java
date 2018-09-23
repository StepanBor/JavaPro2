package com.gmail.stepan1983.DTO;


import com.gmail.stepan1983.model.Shipment;

public class ShipmentDTO {

    private long id;

    private String shippingAddress;

    private String shipmentStatus;

    private Long order;

    public ShipmentDTO(long id, String shippingAddress, String shipmentStatus, Long order) {
        this.id = id;
        this.shippingAddress = shippingAddress;
        this.shipmentStatus = shipmentStatus;
        this.order = order;
    }

    public Shipment toShipment(){
        return new Shipment(shippingAddress,shipmentStatus,null);
    }

    public ShipmentDTO() {
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

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }


}
