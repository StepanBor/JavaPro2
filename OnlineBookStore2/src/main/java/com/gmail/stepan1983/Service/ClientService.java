package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClientService {

    Client addClient(Client client);

    Client getByLogin(String login);

    Client getById(Long id);

    void updateClient(Client client);

    List<Client> findAll(Pageable pageable);

    List<Client> findAll();

    long count();
}
