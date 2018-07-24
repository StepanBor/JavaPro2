package com.gmail.stepan1983;

import javax.persistence.*;

@Entity
public class Currency {

    private String currencyName;

    private double absUnit;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    public Currency(String currencyName, double absUnit) {
        this.currencyName = currencyName;
        this.absUnit = absUnit;
    }

    public Currency() {
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getAbsUnit() {
        return absUnit;
    }

    public void setAbsUnit(double absUnit) {
        this.absUnit = absUnit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
