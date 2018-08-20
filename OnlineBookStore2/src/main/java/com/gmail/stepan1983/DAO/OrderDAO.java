package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order,Long> {
}
