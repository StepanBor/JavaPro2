package com.gmail.stepan1983;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class Controller extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DatabaseModel dbm = new DatabaseModel();
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");

        String dishName = request.getParameter("dishName");
        String dishPrise = request.getParameter("dishPrice");
        String dishWeight = request.getParameter("dishWeight");
        String dishDiscount = request.getParameter("dishDiscount");

        if (dishDiscount != null && dishPrise != null && dishWeight != null) {
            Dish d = new Dish(dishName, Double.parseDouble(dishWeight), Double.parseDouble(dishPrise), Double.parseDouble(dishDiscount));
            dbm.addDish(d, emf);
        }

        List<Dish> menu = dbm.getMenu(emf);

        request.setAttribute("menu", menu);

        RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
        rd.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DatabaseModel dbm = new DatabaseModel();
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
//        dbm.addDish(new Dish(),emf);
        List<Dish> menu;
        if (request.getParameter("getDishByPrice") != null) {

            menu=dbm.getDishByPrice(Double.parseDouble(request.getParameter("lowerPrice")),
                    Double.parseDouble(request.getParameter("higerPrice")), emf);
        } else if(request.getParameter("getDishByMaxWeight")!=null){
            menu=dbm.getDishByMaxWeight(Double.parseDouble(request.getParameter("maxWeight")), emf);
        } else if(request.getParameter("getDishWithDiscount")!=null){
            menu=dbm.getDishWithDiscount(emf);
        } else {
            menu=dbm.getMenu(emf);
        }

        request.setAttribute("menu", menu);
        RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
        rd.forward(request, response);
    }

}
