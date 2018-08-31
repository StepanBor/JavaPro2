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

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;


@Service
public class ClientServiceImpl implements ClientService {


    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    ClientDAO clientDAO;

    @Override
    @Transactional
    public Client addClient(Client client) {
//        clientDAO.save(client);
        return entityManager.merge(client);
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
    @Transactional
    public List<Client> findAll() {
        return clientDAO.findAll();
    }

    @Override
    @Transactional
    public List<Client> findAll(Pageable pageable) {

        boolean sortDirection;

        return clientDAO.findAll(pageable).getContent();
    }

    @Transactional
    @Override
    public List<Client> findAll(Integer page, Integer itemsPerPage, String sortBy, boolean sortDirection){

        boolean sortDirect=sortDirection;

        Sort sort=new Sort(sortDirect?Sort.Direction.ASC:Sort.Direction.DESC,sortBy);

        Pageable pageable=PageRequest.of(page,itemsPerPage,sort);


        return clientDAO.findAll(pageable).getContent();
    }

    @Override
    @Transactional
    public long count() {
        return clientDAO.count();
    }

    @Override
    @Transactional
    public Client getById(Long id) {

        Optional<Client> optionalClient=clientDAO.findById(id);

        return optionalClient.get();
    }


}
