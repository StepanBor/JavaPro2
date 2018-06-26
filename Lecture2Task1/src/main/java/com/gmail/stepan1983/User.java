package com.gmail.stepan1983;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String lastName;
    private int age;
    private String password;

    public User(String name, String lastName, int age, String password) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
