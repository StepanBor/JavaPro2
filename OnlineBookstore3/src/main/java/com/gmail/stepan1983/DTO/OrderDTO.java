package com.gmail.stepan1983.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.gmail.stepan1983.Service.ClientService;
import com.gmail.stepan1983.config.ContextProvider;
import com.gmail.stepan1983.model.BookItem;
import com.gmail.stepan1983.model.Order;
import com.gmail.stepan1983.model.OrderStatus;
import com.gmail.stepan1983.model.Shipment;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDTO {

    ClientService clientService=ContextProvider.getBean(com.gmail.stepan1983.Service.ClientServiceImpl.class);

    private long id;

    private List<MyEntry> orderList;

//    private Map<BookItemDTO,Integer> orderMap;


    private double orderPrice;

    private ClientDTO client;

    private ShipmentDTO shipment;

    private String status;

//    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Date orderDate;

//    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

    public OrderDTO(long id, List<MyEntry> orderList, double orderPrice, ClientDTO client,
                    ShipmentDTO shipment, String status,
                    Date orderDate /*Map<BookItemDTO,Integer> orderMap*/) {
        this.id = id;
        this.orderList = orderList;
        this.orderPrice = orderPrice;
        this.client = client;
        this.shipment = shipment;
        this.status = status;
        this.orderDate = orderDate;
//        this.orderMap=orderMap;
    }

    public OrderDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public List<BookItemDTO> getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(List<BookItemDTO> orderList) {
//        this.orderList = orderList;
//    }

    public Order toOrder(){

        List<BookItem> orderListTemp=new ArrayList<>();

        for (MyEntry entry : orderList) {
            for (int i = 0; i < entry.getValue(); i++) {
                orderListTemp.add(entry.getKey().toBookItem());
            }
        }

        Order order=new Order(orderListTemp,clientService.getById(client.getId()),
                this.shipment.toShipment(),OrderStatus.valueOf(status),orderDate);

        order.getShipment().setOrder(order);

        order.setId(id);

        return order;
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

//    public Map<BookItemDTO, Integer> getOrderMap() {
//        return orderMap;
//    }
//
//    public void setOrderMap(Map<BookItemDTO, Integer> orderMap) {
//        this.orderMap = orderMap;
//    }


    public List<MyEntry> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<MyEntry> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", orderList=" + orderList +
                ", orderPrice=" + orderPrice +
                ", client=" + client +
                ", shipment=" + shipment +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
