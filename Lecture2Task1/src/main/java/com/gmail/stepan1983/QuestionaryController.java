package com.gmail.stepan1983;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class QuestionaryController extends javax.servlet.http.HttpServlet {

    Model dataMod = new Model();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        User tempUser = new User(request.getParameter("UserName"), request.getParameter("LastName"), request.getParameter("Password"));

        TreeMap<User, ArrayList<String>> Users = (TreeMap<User, ArrayList<String>>) dataMod.getGeneralUserStats();

        if (request.getParameter("answers")!=null){

            HttpSession session2=request.getSession(true);
            ArrayList<String> answ=new ArrayList<>();

            answ.add(request.getParameter("question1"));
            answ.add(request.getParameter("question2"));
            answ.add(request.getParameter("question3"));

            System.out.println(answ+"!!!!!!!!!!!!!!!!!!");


            dataMod.addUserStatsToDataBase((User)session2.getAttribute("User"),answ);

            System.out.println(dataMod.getGeneralUserStats());
            System.out.println(dataMod.getUserStats((User)session2.getAttribute("User")));
            System.out.println(dataMod.getGeneralQuestionStats());

            session2.setAttribute("Users", Users);
            session2.setAttribute("QuestionStats", dataMod.getGeneralQuestionStats());
            request.getRequestDispatcher("Questionary.jsp").forward(request,response);
        }

        if (Users.containsKey(tempUser) && Users.ceilingKey(tempUser).getPassword().equals(request.getParameter("Password"))) {
            HttpSession sesion=request.getSession(true);
            sesion.setAttribute("User", tempUser);
            request.getRequestDispatcher("Questionary.jsp").forward(request,response);

        }else if (request.getParameter("newUser")!=null){
            dataMod.addUserToDataBase(tempUser);
            HttpSession sesion=request.getSession(true);
            sesion.setAttribute("User", tempUser);
            request.getRequestDispatcher("Questionary.jsp").forward(request,response);

        }else if (request.getParameter("signIn")!=null){
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }




    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String a = request.getParameter("a");
        HttpSession session = request.getSession(false);

        if ("exit".equals(a) && (session != null))
            session.removeAttribute("User");

        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
