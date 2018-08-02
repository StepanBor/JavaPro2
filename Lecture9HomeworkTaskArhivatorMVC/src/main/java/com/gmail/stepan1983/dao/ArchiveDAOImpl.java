package com.gmail.stepan1983.dao;

import com.gmail.stepan1983.model.Archive;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.File;
import java.util.List;

@Repository
public class ArchiveDAOImpl implements ArchiveDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void add(Archive arch) {
        System.out.println(arch+"from DAO");
        em.persist(arch);
    }

    @Override
    public void delete(Long[] ids) {
        Archive arch;
        for (long id : ids) {
            arch = em.getReference(Archive.class, id);
            em.remove(arch);
        }
    }

    @Override
    public List<Archive> list() {

        Query q=em.createQuery("SELECT arch FROM Archive arch ORDER BY arch.id");

        return q.getResultList();
    }

    @Override
    public File getFileArch(long id) {

        Archive temp;
        Query q=em.createQuery("SELECT arch FROM Archive arch where arch.id=:id");
        q.setParameter("id",id);
        temp= (Archive) q.getSingleResult();
        return temp.getArchive();

    }
}
