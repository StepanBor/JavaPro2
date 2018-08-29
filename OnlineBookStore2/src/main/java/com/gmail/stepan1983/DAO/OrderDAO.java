package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Order;
import com.gmail.stepan1983.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order,Long> {



}
