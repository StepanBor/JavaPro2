package com.gmail.stepan1983.dao;

import com.gmail.stepan1983.model.Archive;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ArchiveDAOImpl implements ArchiveDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Archive arch) {

    }

    @Override
    public void delete(long[] ids) {

    }

    @Override
    public List<Archive> list() {
        return null;
    }
}
