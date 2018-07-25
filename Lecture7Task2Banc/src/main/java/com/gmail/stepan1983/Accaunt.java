package com.gmail.stepan1983;

import javax.persistence.*;


@Entity
@Table(name="accaunts")
public class Accaunt {

    private double ammaunt;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne
    @JoinColumn(name="currencyId")
    private Currency currency;

    @OneToOne
    @JoinColumn(name="userId")
    User user;

    public Accaunt(double ammaunt, Currency currency, User user) {
        this.ammaunt = ammaunt;
        this.currency = currency;
        this.user = user;
    }

    public Accaunt() {
    }

    public double getAmmaunt() {
        return ammaunt;
    }

    public void setAmmaunt(double ammaunt) {
        this.ammaunt = ammaunt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
