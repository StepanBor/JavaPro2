package com.gmail.stepan1983.Services;

import com.gmail.stepan1983.model.Contact;
import com.gmail.stepan1983.model.GroupContact;


import java.util.List;

public interface ContactService {
    void addContact(Contact contact);
    void addGroup(GroupContact group);
    void deleteContact(long[] ids);
    List<GroupContact> listGroups();
    List<Contact> listContacts(GroupContact group, int start, int count);
    List<Contact> listContacts(GroupContact group);
    long count();
    GroupContact findGroup(long id);
    List<Contact> searchContacts(String pattern);
}
