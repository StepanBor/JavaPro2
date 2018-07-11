package com.gmail.stepan1983;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.List;

public class Controler extends javax.servlet.http.HttpServlet {



    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        DataModel dm=new DataModel();
        List<Apartment> apartmentList=dm.getAppartment();

        String parametr=request.getParameter("parametr");
        String parametrName=request.getParameter("parametrName");
        String operator=request.getParameter("operator");
        String intParametrString=request.getParameter("intParametr");
        String getAllParam=request.getParameter("getAll");
        int intParametr=0;
        if(intParametrString!=null){
            intParametr=Integer.parseInt(intParametrString);
        }else if(parametr!=null){
            apartmentList=dm.getAppartment(parametr,parametrName);
        }else if(intParametr!=0){
            apartmentList=dm.getAppartment(intParametr,parametrName,operator);
        }else if(getAllParam!=null){
            apartmentList=dm.getAppartment();
        }

        request.setAttribute("Appartments", apartmentList);

        RequestDispatcher rd=request.getRequestDispatcher("View");

        rd.forward(request,response);

    }
}
