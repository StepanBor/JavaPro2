package com.gmail.stepan1983;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.*;


public class Controller extends javax.servlet.http.HttpServlet {

    DataInterfase di=new DataBaseModel();

    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        super.init();



    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        String clientName=request.getParameter("clientName");
        String phone=request.getParameter("phone");

        if (clientName!=null & phone!=null){
            Client client=new Client(clientName,phone);
            di.addClient(client);
        }

        String productName=request.getParameter("productName");
        String description=request.getParameter("description");
        String price=request.getParameter("price");

        if (productName!=null & description!=null & price!=null){
            Product product=new Product(productName,  Double.parseDouble(price), description);
            di.addProduct(product);
        }

        String clientId=request.getParameter("clientId");
        String productId=request.getParameter("productId");

        if(clientId!=null & productId!=null){
            Order order = new Order();
            List<Client> clientList=di.getClients();
            List<Product> productList=di.getProducts();

            for (Product prod : productList) {
                if(Integer.parseInt(productId)==prod.getProductId()){
                    order.setProduct(prod);
                    break;
                }
            }

            for (Client cli : clientList) {
                if(Integer.parseInt(clientId)==cli.getClientId()){
                    order.setClient(cli);
                    break;
                }
            }

            di.addOrder(order);
        }

        List<Order> orders=di.getOrders();
        List<Client> clients=di.getClients();
        List<Product> products=di.getProducts();

        request.setAttribute("orders",orders);
        request.setAttribute("clients",clients);
        request.setAttribute("products",products);

        RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
        rd.forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        String getOrders= request.getParameter("getOrders");

        if(getOrders!=null){
            List<Order> orders=di.getOrders();
            List<Client> clients=di.getClients();
            List<Product> products=di.getProducts();

            request.setAttribute("orders",orders);
            request.setAttribute("clients",clients);
            request.setAttribute("products",products);

            RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
            rd.forward(request,response);
        }
    }
}
