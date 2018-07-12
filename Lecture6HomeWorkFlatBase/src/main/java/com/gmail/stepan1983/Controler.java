package com.gmail.stepan1983;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;
import java.sql.*;

public class Controler extends javax.servlet.http.HttpServlet {

    DataModel dm=new DataModel();

    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        super.init();
        Apartment ap1=new Apartment("adres 1", "Obolon", 60.6, 4, 80.59);
        Apartment ap2=new Apartment("adres 2", "Solomenskiy", 60.6, 4, 70.1);
        Apartment ap3=new Apartment("adres 3", "Solomenskiy", 30.1, 2, 50.2);
        Apartment ap4=new Apartment("adres 4", "Obolon", 30.1, 2, 65.2);
        Apartment ap5=new Apartment("adres 4", "Obolon", 60.1, 3, 80.2);

        Apartment[] ap={ap1,ap2,ap3,ap4,ap5};

        for (Apartment app: ap) {
            dm.addAppartment(app);
        }

    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        List<Apartment> apartmentList=dm.getAppartment();

        String parametr=request.getParameter("parametr");
        String parametrName=request.getParameter("parametrName");
        String operator=request.getParameter("operator");
        String intParametrString=request.getParameter("intParametr");
        String getAllParam=request.getParameter("getAll");
        int intParametr=0;
        if(intParametrString!=null){
            intParametr=Integer.parseInt(intParametrString);
            System.out.println(intParametr+parametrName+operator);
            apartmentList=dm.getAppartment(intParametr,parametrName,operator);
        }else if(parametr!=null){
            apartmentList=dm.getAppartment(parametr,parametrName);
        }else if (getAllParam!=null){
            apartmentList=dm.getAppartment();
        }

        request.setAttribute("Appartments", apartmentList);

        RequestDispatcher rd=request.getRequestDispatcher("View.jsp");

        rd.forward(request,response);

    }
}
