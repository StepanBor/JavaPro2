package com.gmail.stepan1983;

import javax.persistence.EntityManager;

public class DatabaseModel {

    public void putMoney(EntityManager em, int accId, double amount){


        em.getTransaction().begin();
        Accaunt accaunt=em.find(Accaunt.class, accId);
        try{

        }

    }

}
