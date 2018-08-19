package com.gmail.stepan1983.config;

import com.gmail.stepan1983.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class Mian {

    @Autowired
    EntityManager em;

    public static void main(String[] args) {
        BookItem bookItem=new BookItem();
        CategoryItem categoryItem=new CategoryItem();
        Client client=new Client();
        ClientGroup clientGroup=new ClientGroup();
        Order order=new Order();
        Publisher publisher=new Publisher();
        Shipment shipment=new Shipment();
        Stock stock=new Stock();
        StorageBooks storageBooks=new StorageBooks();

//        em.
    }




}
