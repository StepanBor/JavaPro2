package com.gmail.stepan1983.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contacts")
public class Contact {

    private String name;

    private String lastname;

    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private GroupContact group;

    public Contact(String name, String lastname, String email, GroupContact groupContact) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.group = groupContact;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GroupContact getGroup() {
        return group;
    }

    public void setGroup(GroupContact group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", group=" + group +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return getId() == contact.getId() &&
                Objects.equals(getName(), contact.getName()) &&
                Objects.equals(getLastname(), contact.getLastname()) &&
                Objects.equals(getEmail(), contact.getEmail()) &&
                Objects.equals(getGroup(), contact.getGroup());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getLastname(), getEmail(), getId(), getGroup());
    }
}
