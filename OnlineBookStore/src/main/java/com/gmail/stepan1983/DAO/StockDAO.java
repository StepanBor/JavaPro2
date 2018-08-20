package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDAO extends JpaRepository<Stock,Long> {
}
