package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShipmentDAO extends JpaRepository<Shipment, Long> {

//
//    @Query("SELECT s FROM Shipment s WHERE c.name LIKE :pattern")
//    Shipment getByOder(@Param("login") String login);
}
