package com.gmail.stepan1983;

import java.util.Objects;

public class Client {

    private String name;
    private String phone;

    private int clientId;

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;

    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return getClientId() == client.getClientId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getClientId());
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
