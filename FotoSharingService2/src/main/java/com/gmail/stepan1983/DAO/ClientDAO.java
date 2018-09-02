package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface ClientDAO extends JpaRepository<Client,Long> {

    @Query("SELECT c FROM Client c WHERE c.login=:login")
    Client getByLogin(@Param("login") String login);

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Client u WHERE u.login = :login")
    boolean existsByLogin(@Param("login") String login);



}
