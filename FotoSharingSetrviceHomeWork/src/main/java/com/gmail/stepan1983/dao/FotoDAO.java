package com.gmail.stepan1983.dao;

import com.gmail.stepan1983.model.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoDAO extends JpaRepository<Foto, Long> {

}
