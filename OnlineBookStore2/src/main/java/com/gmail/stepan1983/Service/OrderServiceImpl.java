package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.DAO.BookDAO;
import com.gmail.stepan1983.DAO.ClientDAO;
import com.gmail.stepan1983.DAO.OrderDAO;
import com.gmail.stepan1983.model.BookItem;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDAO oredrDAO;

    @Autowired
    BookService bookService;

    @Autowired
    ClientService clientService;

    @Autowired
    ShipmentService shipmentService;

    @Override
    @Transactional
    public void addOrder(Order order) {
        for (BookItem bookItem : order.getOrderList()) {
            bookService.addBookItem(bookItem);
        }
        clientService.addClient(order.getClient());
        shipmentService.addShipment(order.getShipment());
        oredrDAO.save(order);
    }

    @Override
    @Transactional(readOnly = true)
    public Order getById(Long orderId) {

        Optional<Order> optional=oredrDAO.findById(orderId);
        return optional.get();
    }

    @Override
    @Transactional
    public void updateOrder(Order order) {

        for (BookItem bookItem : order.getOrderList()) {
            bookService.addBookItem(bookItem);
        }
        clientService.addClient(order.getClient());
        shipmentService.addShipment(order.getShipment());
        oredrDAO.save(order);

    }

    @Override
    @Transactional(readOnly = true)
    public Page<Order> findAll(Pageable pageable) {
        return oredrDAO.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Order> findAll() {
        return oredrDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Order> findByClient(Long clientId) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return 0;
    }
}
