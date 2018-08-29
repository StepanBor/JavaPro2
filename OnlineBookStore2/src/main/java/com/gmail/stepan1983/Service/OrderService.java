package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.model.BookItem;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);

    Order getById(Long bookId);

    void updateOrder(Order order);

    Page<Order> findAll(Pageable pageable);

    List<Order> findAll();

    Page<Order> findByClient(Client client, Pageable pageable);

    long count();

    long count(Order orderExample);
}
