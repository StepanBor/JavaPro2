package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.ClientGroup;
import com.gmail.stepan1983.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientGroupDAO extends JpaRepository<ClientGroup,Long> {

//    @Query("SELECT c FROM ClientGroup c WHERE c.client= :client")
//    ClientGroup findByClient(@Param("client") Client client);

    @Query("SELECT c FROM ClientGroup c WHERE c.groupName= :name")
    ClientGroup findByGroupName(@Param("name") String clientGroupName);

}
