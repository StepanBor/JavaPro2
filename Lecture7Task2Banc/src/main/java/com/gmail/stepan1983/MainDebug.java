package com.gmail.stepan1983;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class MainDebug {

    public static void main(String[] args) {

        Double d=127d;
        Float f=5f;
        Long i=-128l;
        Long b=-128l;
        Double c=127d;
        System.out.println(d==c);
        System.out.println(i==b);



    }

}
