package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentDAO extends JpaRepository<Shipment,Long> {
}
