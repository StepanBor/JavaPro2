package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Contact;
import com.gmail.stepan1983.model.GroupContact;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class GroupDAOImpl implements GroupDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<GroupContact> getGroups() {
        TypedQuery<GroupContact> query = em.createQuery(
                "SELECT g FROM GroupContact g ORDER BY g.id DESC",
                GroupContact.class);
        return query.getResultList();
    }

    @Override
    public GroupContact getGroupById(long id) {
        TypedQuery<GroupContact> query = em.createQuery(
                "SELECT g FROM GroupContact g WHERE g.id LIKE :id"
                , GroupContact.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }


    @Override
    public void addGroup(GroupContact group) {
        em.persist(group);
    }

    @Override
    public void deleteGroup(long[] groupId) {
        GroupContact g;
        for (long id : groupId) {
            g = em.getReference(GroupContact.class, id);
            em.remove(g);
        }
    }
}
