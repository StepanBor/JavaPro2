package com.gmail.stepan1983;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class DatabaseModel implements DataBaseInterface {

    public void putMoney(EntityManager em, int accId, double amount) {

        em.getTransaction().begin();
        Accaunt accaunt = em.find(Accaunt.class,(long) accId);
        if (accaunt == null) {
            System.out.println("there is no such account");
            return;
        }
        Transaction transaction = new Transaction(accaunt, 0, amount);
        try {

            accaunt.setAmmaunt((accaunt.getAmmaunt() + amount));
            em.persist(transaction);
            em.merge(accaunt);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }

    }

    public void withdrawMoney(EntityManager em, int accId, double amount) {

        em.getTransaction().begin();
        Accaunt accaunt = em.find(Accaunt.class,(long) accId);
        if (accaunt == null) {
            System.out.println("there is no such account");
            return;
        }
        Transaction transaction = new Transaction(accaunt, amount, 0);
        try {

            accaunt.setAmmaunt((accaunt.getAmmaunt() - amount));
            em.persist(transaction);
            em.merge(accaunt);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }

    }

    public void transferMoney(EntityManager em, int fromAccId, int toAccId, double amount, Currency currency) {


        Accaunt fromAcc = em.find(Accaunt.class,(long) fromAccId);
        Accaunt toAcc = em.find(Accaunt.class,(long) toAccId);
        if (fromAcc == null || toAcc == null) {
            System.out.println("there is no such accaunt");
            return;
        }
        Currency currFromAcc = fromAcc.getCurrency();
        Currency currToAcc = toAcc.getCurrency();

        putMoney(em, toAccId, (amount * currFromAcc.getAbsUnit() / currency.getAbsUnit()));
        withdrawMoney(em, fromAccId, (amount * currToAcc.getAbsUnit() / currency.getAbsUnit()));

    }

    public double getUserMoney(EntityManager em, int userId) {

        User user = em.find(User.class,(long) userId);
        double result = 0.0;
        if (user == null) {
            System.out.println("there is no such user");
            return 0.0;
        }

        Query query = em.createQuery("SELECT a FROM Accaunt a WHERE a.user.id=:userId");
        query.setParameter("userId",(long) userId);

        List<Accaunt> userAcc = query.getResultList();
        for (Accaunt accaunt : userAcc) {
            result += (accaunt.getAmmaunt() * accaunt.getCurrency().getAbsUnit() / 0.8);
        }
        return result;
    }

    public List<Accaunt> getAccaunts(EntityManager em) {

        Query query = em.createQuery("SELECT a FROM Accaunt a");

        List<Accaunt> resultList;

        resultList = (List<Accaunt>) query.getResultList();

        return resultList;

    }

    public List<Transaction> getTransactions(EntityManager em) {

        Query query = em.createQuery("SELECT t FROM Transaction t");

        List<Transaction> resultList;

        resultList = (List<Transaction>) query.getResultList();

        return resultList;

    }

    public List<User> getUsers(EntityManager em) {

        Query query = em.createQuery("SELECT u FROM User u");

        List<User> resultList;

        resultList = (List<User>) query.getResultList();

        return resultList;

    }

    public List<Currency> getCurency(EntityManager em) {

        Query query = em.createQuery("SELECT c FROM Currency c");

        List<Currency> resultList;

        resultList = (List<Currency>) query.getResultList();

        return resultList;

    }


}
