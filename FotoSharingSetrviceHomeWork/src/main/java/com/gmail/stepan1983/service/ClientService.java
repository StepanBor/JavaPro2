package com.gmail.stepan1983.service;

import com.gmail.stepan1983.model.Client;
import java.util.List;

public interface ClientService {

    Client addClient(Client client);

    Client getByLogin(String login);

    Client getById(Long id);

    void updateClient(Client client);

    List<Client> findAll();

    List<Client> findAll(Integer page, Integer itemsPerPage,
                         String sortBy, boolean sortDirection);

    long count();
}
