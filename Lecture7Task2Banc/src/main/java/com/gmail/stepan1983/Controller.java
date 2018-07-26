package com.gmail.stepan1983;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Controller", value = "/Controller")
public class Controller extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();

        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
        Currency UAH = new Currency("UAH", 0.0385);
        Currency USD = new Currency("USD", 1);
        Currency EUR = new Currency("EUR", 1.26);

        em.getTransaction().begin();

        try {
            em.merge(UAH);
            em.merge(USD);
            em.merge(EUR);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
        DatabaseModel dbm = new DatabaseModel();

        String addUser = request.getParameter("addUser");
        String addAccaunt = request.getParameter("addAccaunt");

        if (request.getParameter("addUser") != null) {
            String userName = request.getParameter("userName");
            User user = new User("userName");

            em.getTransaction().begin();

            try {
                em.persist(user);
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
            }

        } else if (request.getParameter("addAccaunt") != null) {

            String userId = request.getParameter("userId");
            String currencyId = request.getParameter("currencyId");
            String amauntString = request.getParameter("amaunt");
            double ammaunt = Double.parseDouble(amauntString);
            Accaunt accaunt = new Accaunt(ammaunt, em.find(Currency.class, currencyId), em.find(User.class, userId));

            em.getTransaction().begin();

            try {
                em.persist(accaunt);
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
            }

        } else if (request.getParameter("putMoney") != null) {

            String accId = request.getParameter("accId");
            String sumString = request.getParameter("sum");

            dbm.putMoney(em, Integer.parseInt(accId), Double.parseDouble(sumString));

        }

        List<User> users = dbm.getUsers(em);
        List<Accaunt> accaunts = dbm.getAccaunts(em);
        List<Transaction> transactions = dbm.getTransactions(em);
        List<Currency> currencies = dbm.getCurency(em);

        RequestDispatcher rd = request.getRequestDispatcher("View.jsp");

        request.setAttribute("users", users);
        request.setAttribute("accaunts", accaunts);
        request.setAttribute("transactions", transactions);
        request.setAttribute("currency", currencies);
        rd.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
        DatabaseModel dbm = new DatabaseModel();

        if (request.getParameter("transferMoney") != null) {

            String fromAccId = request.getParameter("fromAccId");
            String toAccId = request.getParameter("toAccId");
            String sumString = request.getParameter("sum");
            String currId = request.getParameter("curId");

            Currency currency = em.find(Currency.class, Integer.parseInt(currId));

            dbm.transferMoney(em, Integer.parseInt(fromAccId), Integer.parseInt(toAccId), Double.parseDouble(sumString), currency);

        } else if (request.getParameter("getUserMoney") != null) {

            String userId = request.getParameter("userId");

            Double userMoney = dbm.getUserMoney(em, Integer.parseInt("userId"));

        }

        List<User> users = dbm.getUsers(em);
        List<Accaunt> accaunts = dbm.getAccaunts(em);
        List<Transaction> transactions = dbm.getTransactions(em);
        List<Currency> currencies = dbm.getCurency(em);

        RequestDispatcher rd = request.getRequestDispatcher("View.jsp");

        request.setAttribute("users", users);
        request.setAttribute("accaunts", accaunts);
        request.setAttribute("transactions", transactions);
        request.setAttribute("currency", currencies);
        rd.forward(request, response);

    }
}
