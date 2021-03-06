package com.gmail.stepan1983;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


//@WebListener()
public class MyListener implements ServletContextListener{

    // Public constructor is required by servlet spec
    public MyListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    @Override
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bank");
        System.out.println(emf+"!!!!!!!!!!!!!!!!!");
        sce.getServletContext().setAttribute("emf",emf);
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        EntityManagerFactory emf = (EntityManagerFactory)sce
                .getServletContext()
                .getAttribute("emf");
        emf.close();
    }


}
