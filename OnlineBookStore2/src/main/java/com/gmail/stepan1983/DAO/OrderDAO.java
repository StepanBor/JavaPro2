package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order, Long>, QueryByExampleExecutor<Order> {

    @Query("SELECT o FROM Order o WHERE o.client= :client ORDER BY o.orderPrice DESC ")
    Page<Order> findByClient(@Param("client") Client client, Pageable pageable);

}
