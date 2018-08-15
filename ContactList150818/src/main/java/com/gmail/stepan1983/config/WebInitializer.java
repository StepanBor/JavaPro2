package com.gmail.stepan1983.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext acwac=new AnnotationConfigWebApplicationContext();
        acwac.setConfigLocation(getClass().getPackage().getName());

        ServletRegistration.Dynamic servlet = servletContext
                .addServlet("dispatcher", new DispatcherServlet(acwac));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);



    }
}
