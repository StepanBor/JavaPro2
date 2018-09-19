package com.gmail.stepan1983.model;


import com.gmail.stepan1983.DTO.BookItemDTO;
import com.gmail.stepan1983.DTO.MyEntry;
import com.gmail.stepan1983.DTO.OrderDTO;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Orders1")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private long id;

    //    @OneToMany
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Orders_books", joinColumns = {@JoinColumn(name = "orderId")},
            inverseJoinColumns = {@JoinColumn(name = "id")})
    private List<BookItem> orderList;

    private double orderPrice;

    @OneToOne
//    @JoinColumn(name="clientId")
    private Client client;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="shipmentId")
    private Shipment shipment;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Temporal(value = TemporalType.DATE)
    private Date orderDate;



    public Order(List<BookItem> orderList, Client client,
                 Shipment shipment, OrderStatus status, Date orderDate) {

        this.orderList = orderList;

        for (BookItem bookItem : orderList) {
            this.orderPrice += bookItem.getPrice();
        }

        this.client = client;
        this.shipment = shipment;
        this.status = status;
        this.orderDate = orderDate;

    }

    public Order() {
    }

    public OrderDTO toDTO() {
        Map<BookItemDTO,Integer> orderMap=new TreeMap<>((BookItemDTO bo1, BookItemDTO bo2)->((int)(bo1.getId()-bo2.getId())));
        OrderDTO orderDTO=new OrderDTO();
        List<MyEntry> orderListDTO=new ArrayList<>();
        for (BookItem bookItem: orderList) {
            BookItemDTO bookItemDTO=bookItem.toDTO();
//            orderListDTO.add(bookItemDTO);
            if(orderMap.containsKey(bookItemDTO)){
                orderMap.put(bookItemDTO,(orderMap.get(bookItemDTO)+1));
            } else {
                orderMap.put(bookItemDTO,1);
            }
        }

        for (BookItemDTO bookItemDTO : orderMap.keySet()) {
            orderListDTO.add(new MyEntry(bookItemDTO,orderMap.get(bookItemDTO)));
        }

        return new OrderDTO(id,orderListDTO, orderPrice, client.toDTO(),
                shipment.toDTO(), status.toString(), orderDate/*, orderMap*/);
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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
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
        return "Order{" +
                "id=" + id +
//                ", orderList=" + orderList +
                ", orderPrice=" + orderPrice +
                ", client=" + client +
                ", shipment=" + shipment.getId() +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
