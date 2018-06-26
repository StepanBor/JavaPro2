package com.gmail.stepan1983;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class QuestionaryController extends javax.servlet.http.HttpServlet {

    Model dataMod = new Model();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        User tempUser = new User(request.getParameter("UserName"), request.getParameter("LastName"), request.getParameter("Password"));

        TreeMap<User, List<String>> Users = (TreeMap<User, List<String>>) dataMod.getGeneralUserStats();
        if (Users.containsKey(tempUser) & Users.ceilingKey(tempUser).getPassword().equals(request.getParameter("Password"))) {
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

    }
}
