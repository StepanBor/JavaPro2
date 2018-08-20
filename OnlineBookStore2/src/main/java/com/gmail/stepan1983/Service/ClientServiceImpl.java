package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.DAO.ClientDAO;
import com.gmail.stepan1983.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;

    @Override
    @Transactional
    public void addClient(Client client) {
        clientDAO.save(client);
    }

    @Override
    @Transactional(readOnly = true)
    public Client getByLogin(String login) {
        return clientDAO.getByLogin(login);
    }

    @Override
    @Transactional
    public void updateClient(Client client) {
        clientDAO.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientDAO.findAll();
    }

    @Override
    public Page<Client> findAll(Pageable pageable) {

        return clientDAO.findAll(pageable);
    }

    @Override
    public long count() {
        return clientDAO.count();
    }
}
