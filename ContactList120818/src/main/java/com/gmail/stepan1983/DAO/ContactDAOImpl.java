package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Contact;
import com.gmail.stepan1983.model.GroupContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.text.AbstractDocument;
import javax.swing.text.html.parser.Entity;
import java.util.List;
@Repository
public class ContactDAOImpl implements ContactDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Contact> getContactList(GroupContact groupContact, int start, int maxRes) {
        TypedQuery<Contact> query;

        if (groupContact!=null){
            query=em.createQuery("SELECT c FROM Contact c WHERE c.group=:Group ORDER BY c.id DESC ", Contact.class);
            query.setParameter("Group", groupContact);
        } else {
            query=em.createQuery("SELECT c FROM Contact c ORDER BY c.id DESC", Contact.class);
        }

        if (start >= 0) {
            query.setFirstResult(start);
            query.setMaxResults(maxRes);
        }

        return query.getResultList();
    }

    @Override
    public List<Contact> getContactList(String pattern) {
        TypedQuery<Contact> query=em.createQuery(
                "SELECT c FROM Contact c WHERE c.name LIKE :pattern ORDER BY c.id DESC", Contact.class);
        query.setParameter("pattern","%"+pattern+"%");
        return query.getResultList();
    }

    @Override
    public void addContact(Contact contact) {
    em.persist(contact);
    }

    @Override
    public void deleteContact(long[] contactId) {
        Contact c;
        for (long id : contactId) {
            c = em.getReference(Contact.class, id);
            em.remove(c);
        }
    }

    @Override
    public long count() {
        TypedQuery<Long> query = em.createQuery("SELECT COUNT(c) FROM Contact c", Long.class);
        return query.getSingleResult();
    }
}
