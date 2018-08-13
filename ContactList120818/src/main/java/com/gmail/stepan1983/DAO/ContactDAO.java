package com.gmail.stepan1983.DAO;


import com.gmail.stepan1983.model.Contact;
import com.gmail.stepan1983.model.GroupContact;

import java.util.List;

public interface ContactDAO {

    List<Contact> getContactList(GroupContact groupContact, int staet, int maxRes);
//    Contact getContactById(long id);
    List<Contact> getContactList(String pattern);
    void addContact(Contact contact);
    void deleteContact(long[] contactId);
    long count();


}
