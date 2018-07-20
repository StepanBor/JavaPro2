package com.gmail.stepan1983;

import javax.persistence.*;

public class DatabaseModel {

    static EntityManagerFactory emf=Persistence.createEntityManagerFactory("MenuUnit");
    static EntityManager em=emf.createEntityManager();

    public static void addDish(Dish dish){

        em.getTransaction().begin();
        try {
            em.persist(dish);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
        }

    }

}
