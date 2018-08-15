package com.gmail.stepan1983.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "groups1")
public class GroupContact {

    private String groupName;
    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "group")
    private List<Contact> contacts;

    public GroupContact(String groupName, List<Contact> contacts) {
        this.groupName = groupName;
        this.contacts = contacts;
    }

    public GroupContact() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


}
