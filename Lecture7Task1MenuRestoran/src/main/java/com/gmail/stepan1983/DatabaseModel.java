package com.gmail.stepan1983;

import javax.persistence.*;
import java.util.List;

public class DatabaseModel {



    public void addDish(Dish dish, EntityManagerFactory emf){

       EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();
        try {
            em.persist(dish);
            em.getTransaction().commit();
        } catch (Exception e){
            System.out.println("Something went wrong during addDish!!!!");
            em.getTransaction().rollback();
        }

    }

    public List<Dish> getDishByPrice(double lowerPrice, double upperPrice, EntityManagerFactory emf){

        EntityManager em=emf.createEntityManager();
        List<Dish> resultList;
        Query query = em.createQuery("SELECT d FROM Dish d WHERE d.price >= :lowerPrice AND d.price<:upperPrice");
        query.setParameter("lowerPrice", lowerPrice);
        query.setParameter("upperPrice", upperPrice);
        resultList = (List<Dish>) query.getResultList(); // type cast!!!

        return resultList;

    }

    public List<Dish> getDishWithDiscount(EntityManagerFactory emf){
        EntityManager em=emf.createEntityManager();
        List<Dish> resultList;
        Query query = em.createQuery("SELECT d FROM Dish d WHERE d.discount != 0 ");

        resultList = (List<Dish>) query.getResultList(); // type cast!!!

        return resultList;
    }

    public List<Dish> getDishByMaxWeight(double maxWeight, EntityManagerFactory emf){

        EntityManager em=emf.createEntityManager();
        List<Dish> resultList;
        Query query = em.createQuery("SELECT d, SUM (d.weight) FROM Dish d HAVING SUM(d.weight)<=:maxWeight");
        query.setParameter("maxWeight", maxWeight);

        resultList = (List<Dish>) query.getResultList(); // type cast!!!

        return resultList;

    }

    public  List<Dish> getMenu(EntityManagerFactory emf){

        EntityManager em=emf.createEntityManager();
        List<Dish> resultList;
        Query query = em.createQuery("SELECT d FROM Dish d ");

        resultList = (List<Dish>) query.getResultList(); // type cast!!!

        return resultList;
    }

}
