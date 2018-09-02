package com.gmail.stepan1983.model;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "Client1")
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="clientId")
    private long id;

    private String login;

    private String password;

    private String email;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private File avatar;

    public Client(String login, String password, String email, String name, UserRole role, File avatar) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.name = name;
        this.role = role;
        this.avatar = avatar;
    }

    public Client() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public File getAvatar() {
        return avatar;
    }

    public void setAvatar(File avatar) {
        this.avatar = avatar;
    }
}
