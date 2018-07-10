package com.gmail.stepan1983;

import java.sql.*;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.*;

public class Model {


    private static  String url = "jdbc:mysql://localhost:3306/advert";
    private static  String user = "root";
    private  static String password = "1979";


    public static void addUserToDatabase(User us) {

//        C3p0 pull

        try (Connection con = DriverManager.getConnection(url, user, password); Statement st = con.createStatement()) {
            st.executeUpdate("create table if not exists users(id SERIAL, userName VARCHAR (100)," +
                    " userPassword VARCHAR (100), primary key (id))");
//            ResultSet rs=st.executeQuery("SELECT userId FROM users WHERE userName='"+us.getUserName()+"';");
//            if(rs.getString("userName")==null){
            System.out.println("hhhhhhhhg");
                PreparedStatement addUser = con.prepareStatement("INSERT INTO  users (userName, userPassword) VALUES (?,?)");
                addUser.setString(1, us.getUserName());
                addUser.setString(2, us.getPassword());
                addUser.executeUpdate();

//            ResultSet rs=st.executeQuery("SELECT userId FROM users WHERE userName='"+us.getUserName()+"';");
//            int tempId=rs.getInt("userId");
//            System.out.println(tempId+"fffffffffffff");
//            us.setUserId(tempId);
                addUser.close();
//            } else {
//                return;
//            }



        } catch (SQLException e) {
            System.out.println(e);
        }

        try (Connection con = DriverManager.getConnection(url, user, password); Statement st = con.createStatement()){
            ResultSet rs=st.executeQuery("SELECT id FROM users WHERE userName='"+us.getUserName()+"';");

            int tempId=rs.getInt("id");
            System.out.println(tempId+"fffffffffffff");
            us.setUserId(tempId);
        }catch (SQLException e){
            System.out.println(e);
        }



    }

    public  static void addAdvToDatabase(Advert ad, User us) {
        try (Connection con = DriverManager.getConnection(url, user, password); Statement st = con.createStatement()) {
//            st.executeUpdate("create table if not exists users(userId SERIAL, userName VARCHAR (100)," +
//                    " password VARCHAR (100), primary key (userId))");
            st.executeUpdate("create table if not exists adverts (id Serial, messageText varchar(200)," +
                    " publishDate DATE, user_Id BIGINT UNSIGNED," +
                    "primary key (id), foreign key (user_Id) REFERENCES users (id))");

            PreparedStatement addAdv = con.prepareStatement("INSERT INTO adverts (messageText, publishDate, user_Id) VALUES (?,?,?)");
            addAdv.setString(1, ad.getMessage());
            addAdv.setDate(2, ad.getSQLPublishDate());
            addAdv.setInt(3, us.getUserId());
            addAdv.executeUpdate();
            addAdv.close();


//            st.executeUpdate("INSERT INTO adverts (messageText, publishDate, userId) VALUES ('"+ad.getMessage()+"''" +ad.getPublishDate()+"''"
//                    +us.getUserId()+"')");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static TreeSet<Advert> getAdvertFromBase(){
        TreeSet<Advert> results=new TreeSet<Advert>((Advert a1, Advert a2)->a1.getPublishDate().compareTo(a2.getPublishDate()));
        try (Connection con = DriverManager.getConnection(url, user, password); Statement st = con.createStatement()) {
            ResultSet rs=st.executeQuery("SELECT * FROM adverts");
            while (rs.next()){
                Advert temp=new Advert(rs.getString("messageText"),rs.getInt("id"),
                        rs.getInt("userId"),rs.getDate("publishDate").toString());
                results.add(temp);

            }


        }catch (SQLException e) {
            System.out.println(e);
        }
        return results;
    }

}
