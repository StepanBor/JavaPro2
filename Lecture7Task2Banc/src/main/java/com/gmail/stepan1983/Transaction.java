package com.gmail.stepan1983;

import javax.persistence.*;

@Entity
@Table(name="transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne
    @JoinColumn(name="AccauntId")
    private Accaunt fromAcc;

    private double withdraw;

    private double put;

    public Transaction(Accaunt fromAcc, double withdraw, Accaunt toAcc, double put) {
        this.fromAcc = fromAcc;
        this.withdraw = withdraw;
        this.put = put;
    }

    public Transaction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Accaunt getFromAcc() {
        return fromAcc;
    }

    public void setFromAcc(Accaunt fromAcc) {
        this.fromAcc = fromAcc;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getPut() {
        return put;
    }

    public void setPut(double put) {
        this.put = put;
    }
}
