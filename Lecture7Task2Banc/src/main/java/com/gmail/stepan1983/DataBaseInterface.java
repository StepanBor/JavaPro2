package com.gmail.stepan1983;

import javax.persistence.EntityManager;
import java.util.List;

public interface DataBaseInterface {

    void putMoney(EntityManager em, int accId, double amount);

    void withdrawMoney(EntityManager em, int accId, double amount);

    void transferMoney(EntityManager em, int fromAccId, int toAccId, double amount, Currency currency);

    double getUserMoney(EntityManager em, int userId);

    List<Accaunt> getAccaunts(EntityManager em);

    List<Transaction> getTransactions(EntityManager em);

    List<User> getUsers(EntityManager em);

    List<Currency> getCurency(EntityManager em);
}
