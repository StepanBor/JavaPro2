package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PhotoDAO extends JpaRepository<Photo, Long> {

    @Query("SELECT f FROM Photo f WHERE f.client=:client")
    List<Photo> findFotoByClient(@Param("client") Client client);

}
