package com.gmail.stepan1983.Services;

import com.gmail.stepan1983.DAO.ContactDAO;
import com.gmail.stepan1983.DAO.GroupDAO;
import com.gmail.stepan1983.model.Contact;
import com.gmail.stepan1983.model.GroupContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;
    @Autowired
    private GroupDAO groupDAO;

    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    public void addGroup(GroupContact group) {
        groupDAO.addGroup(group);
    }

    @Transactional
    public void deleteContact(long[] ids) {
        contactDAO.deleteContact(ids);
    }

    @Transactional(readOnly=true)
    public List<GroupContact> listGroups() {
        return groupDAO.getGroups();
    }

    @Transactional(readOnly=true)
    public List<Contact> listContacts(GroupContact group, int start, int count) {
        return contactDAO.getContactList(group, start, count);
    }

    @Transactional(readOnly=true)
    public List<Contact> listContacts(GroupContact group) {
        return contactDAO.getContactList(group, 0, 0);
    }

    @Transactional(readOnly = true)
    public long count() {
        return contactDAO.count();
    }

    @Transactional(readOnly=true)
    public GroupContact findGroup(long id) {
        return groupDAO.getGroupById(id);
    }

    @Transactional(readOnly=true)
    public List<Contact> searchContacts(String pattern) {
        return contactDAO.getContactList(pattern);
    }
}
