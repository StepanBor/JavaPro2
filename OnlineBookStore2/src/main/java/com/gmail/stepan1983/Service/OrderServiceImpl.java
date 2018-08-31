package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.DAO.OrderDAO;
import com.gmail.stepan1983.model.BookItem;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {



    @Autowired
    private OrderDAO oredrDAO;

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
    public List<Order> findByClient(Client client, Pageable pageable) {

//        Order exampleObj=new Order();
//        exampleObj.setStatus("Processed");
//        Example<Order> orderExample=Example.of(exampleObj);
//        TypedQuery<Order> query=entityManager.createQuery
//                ("SELECT o FROM Order o WHERE o.client= :client ORDER BY o.orderPrice DESC ",Order.class);
//        query.setParameter("client",client);

        return oredrDAO.findByClient(client,pageable).getContent();
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return oredrDAO.count();
    }

    @Override
    @Transactional(readOnly = true)
    public long count(Order orderExample) {
        return oredrDAO.count();
    }


}
