package com.gmail.stepan1983;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseModel implements DataInterfase {

    private String url="jdbc:mysql://localhost:3306/orders";
    private String user="root";
    private String password="1979";



    @Override
    public void addOrder(Order order) {

        try(Connection con=DriverManager.getConnection(url,user,password);Statement st=con.createStatement()) {

            st.executeUpdate("CREATE TABLE IF NOT EXISTS products (id SERIAL, " +
                    "productName VARCHAR(200) UNIQUE , descripton VARCHAR(200),price DECIMAL(8,2), PRIMARY KEY (id))" );

            st.executeUpdate("CREATE TABLE IF NOT EXISTS clients (id SERIAL, " +
                    "clientName VARCHAR(200), phone VARCHAR(20) UNIQUE, PRIMARY KEY (id))" );


            st.executeUpdate("CREATE TABLE IF NOT EXISTS orders (id SERIAL, " +
                    "clienId BIGINT UNSIGNED NOT NULL, productId BIGINT UNSIGNED NOT NULL, PRIMARY KEY (id), " +
                    "FOREIGN KEY (clienId) REFERENCES clients (id) ON DELETE RESTRICT ON UPDATE CASCADE, " +
                    "FOREIGN KEY (productId) REFERENCES products (id) ON DELETE RESTRICT ON UPDATE CASCADE)");



            PreparedStatement pr3=con.prepareStatement("INSERT IGNORE INTO orders VALUES (id,?,?)");

            pr3.setInt(1,addClient(order.getClient()));
            pr3.setInt(2,addProduct(order.getProduct()));

            pr3.executeUpdate();

            pr3.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public int addClient(Client client) {
        try(Connection con=DriverManager.getConnection(url,user,password);Statement st=con.createStatement()) {

            st.executeUpdate("CREATE TABLE IF NOT EXISTS products (id SERIAL, " +
                    "productName VARCHAR(200) UNIQUE , descripton VARCHAR(200),price DECIMAL(8,2), PRIMARY KEY (id))" );

            st.executeUpdate("CREATE TABLE IF NOT EXISTS clients (id SERIAL, " +
                    "clientName VARCHAR(200), phone VARCHAR(20) UNIQUE, PRIMARY KEY (id))" );


            st.executeUpdate("CREATE TABLE IF NOT EXISTS orders (id SERIAL, " +
                    "clienId BIGINT UNSIGNED NOT NULL, productId BIGINT UNSIGNED NOT NULL, PRIMARY KEY (id), " +
                    "FOREIGN KEY (clienId) REFERENCES clients (id)ON DELETE RESTRICT ON UPDATE CASCADE, " +
                    "FOREIGN KEY (productId) REFERENCES products (id) ON DELETE RESTRICT ON UPDATE CASCADE)");

            PreparedStatement pr=con.prepareStatement("INSERT IGNORE INTO clients VALUES (id, ?,?)");

            pr.setString(1,client.getName());
            pr.setString(2, client.getPhone());

            pr.executeUpdate();

            ResultSet resultSet=st.executeQuery("SELECT id FROM clients WHERE phone LIKE "+client.getPhone());
            resultSet.next();
            client.setClientId(resultSet.getInt("id"));

            pr.close();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return client.getClientId();

    }

    @Override
    public int addProduct(Product product) {

        try(Connection con=DriverManager.getConnection(url,user,password);Statement st=con.createStatement()) {

            st.executeUpdate("CREATE TABLE IF NOT EXISTS products (id SERIAL, " +
                    "productName VARCHAR(200) UNIQUE , descripton VARCHAR(200), price DECIMAL(8,2), PRIMARY KEY (id))" );

            st.executeUpdate("CREATE TABLE IF NOT EXISTS clients (id SERIAL, " +
                    "clientName VARCHAR(200), phone VARCHAR(20) UNIQUE, PRIMARY KEY (id))" );


            st.executeUpdate("CREATE TABLE IF NOT EXISTS orders (id SERIAL, " +
                    "clienId BIGINT UNSIGNED NOT NULL, productId BIGINT UNSIGNED NOT NULL, PRIMARY KEY (id), " +
                    "FOREIGN KEY (clienId) REFERENCES clients (id)ON DELETE RESTRICT ON UPDATE CASCADE, " +
                    "FOREIGN KEY (productId) REFERENCES products (id) ON DELETE RESTRICT ON UPDATE CASCADE)");

            PreparedStatement pr=con.prepareStatement("INSERT IGNORE INTO products VALUES (id,?,?,?)");

            pr.setString(1,product.getProductName());
            pr.setString(2,product.getDescription());
            pr.setBigDecimal(3,BigDecimal.valueOf(product.getPrice()));

            pr.executeUpdate();

            ResultSet resultSet=st.executeQuery("SELECT id FROM products WHERE productName LIKE "+product.getProductName());
            resultSet.next();
            product.setProductId(resultSet.getInt("id"));

            pr.close();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return product.getProductId();
    }

    @Override
    public List<Order> getOrders() {

        List<Order> orderList=new ArrayList<>();
        List<Client> clientList=getClients();
        List<Product> productList=getProducts();

        try(Connection con=DriverManager.getConnection(url,user,password);Statement st=con.createStatement()) {

            ResultSet resultSet=st.executeQuery("SELECT * FROM orders");

            while (resultSet.next()){
                Order tempOrder=new Order();
                Client tempClient=new Client();
                for (Client cl:clientList) {
                    if(cl.getClientId()==resultSet.getInt("clienId")){
                        tempClient=cl;
                        break;
                    }
                }
                tempOrder.setClient(tempClient);

                Product tempProduct=new Product();
                for (Product pr:productList) {
                    if(pr.getProductId()==resultSet.getInt("productId"));
                    break;
                }
                tempOrder.setProduct(tempProduct);

                tempOrder.setOrderId(resultSet.getInt("id"));

                orderList.add(tempOrder);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orderList;
    }


    @Override
    public List<Client> getClients() {

        List<Client> clientList=new ArrayList<>();

        try(Connection con=DriverManager.getConnection(url,user,password);Statement st=con.createStatement()){

            ResultSet resultSet=st.executeQuery("SELECT * FROM clients");

            while (resultSet.next()){
                Client tempClient=new Client();

                tempClient.setClientId(resultSet.getInt("id"));
                tempClient.setPhone(resultSet.getString("phone"));
                tempClient.setName(resultSet.getString("clientName"));

                clientList.add(tempClient);

            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientList;
    }

    @Override
    public List<Product> getProducts() {

        List<Product> productList=new ArrayList<>();

        try(Connection con=DriverManager.getConnection(url,user,password);Statement st=con.createStatement()){

            ResultSet resultSet=st.executeQuery("SELECT * FROM products");

            while (resultSet.next()){
                Product tempProduct=new Product();

                tempProduct.setProductId(resultSet.getInt("id"));
                tempProduct.setProductName(resultSet.getString("productName"));
                tempProduct.setDescription(resultSet.getString("descripton"));
                tempProduct.setPrice(resultSet.getDouble("price"));
                System.out.println(tempProduct+" FROM GET PRODUCTS");
                productList.add(tempProduct);

            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }
}
