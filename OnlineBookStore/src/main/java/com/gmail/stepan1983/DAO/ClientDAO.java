package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<Client,Long> {
}
