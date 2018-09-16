package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.DAO.OrderDAO;
import com.gmail.stepan1983.model.BookItem;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private BookService bookService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ShipmentService shipmentService;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void addOrder(Order order) {
        System.out.println();
        System.out.println();
        System.out.println(order);
//        shipmentService.addShipment(order.getShipment());
        entityManager.merge(order);
    }

    @Override
    @Transactional(readOnly = true)
    public Order getById(Long orderId) {

        Optional<Order> optional = orderDAO.findById(orderId);
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
        orderDAO.save(order);

    }

    @Override
    @Transactional(readOnly = true)
    public Page<Order> findAll(Pageable pageable) {
        return orderDAO.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Order> findAll() {
        return orderDAO.findAll();
    }

    @Transactional
    @Override
    public List<Order> findAll(Integer page, Integer itemsPerPage, String sortBy, boolean sortDirection) {

        Sort sort = new Sort(sortDirection ? Sort.Direction.ASC : Sort.Direction.DESC, sortBy);

        Pageable pageable = PageRequest.of(page, itemsPerPage, sort);

        return orderDAO.findAll(pageable).getContent();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Order> findByClient(Client client, Pageable pageable) {

        return orderDAO.findByClient(client, pageable).getContent();
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return orderDAO.count();
    }

    @Override
    @Transactional(readOnly = true)
    public long count(Order orderExample) {
        return orderDAO.count();
    }


}
