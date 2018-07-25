package com.gmail.stepan1983;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class MainDebug {

    public static void main(String[] args) {

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bank");
        EntityManager em=emf.createEntityManager();

        DatabaseModel dbm=new DatabaseModel();




    }

}
