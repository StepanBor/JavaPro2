package com.gmail.stepan1983;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataModel implements DataBaseModel {

    private String url = "jdbc:mysql://localhost:3306/apartment";
    private String user = "root";
    private String password = "1979";

    @Override
    public void addAppartment(Apartment app) {
        try(Connection con=DriverManager.getConnection(url,user,password); Statement st=con.createStatement();
            PreparedStatement prep=con.prepareStatement("INSERT INTO Apartments VALUES (id,?,?,?,?,?)")) {

            st.executeUpdate("CREATE TABLE IF NOT EXISTS Apartments (id SERIAL, adres VARCHAR(200), district VARCHAR(200)," +
                    "area DOUBLE, roomNum INT, price DOUBLE)");

            prep.setString(1,app.getAddress());
            prep.setString(2,app.getDistrict());
            prep.setDouble(3,app.getArea());
            prep.setInt(4,app.getRoomNum());
            prep.setDouble(5,app.getPrice());

            prep.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Apartment> getAppartment(int queryParam, String paramName, String operator){

        List<Apartment> result=new ArrayList<>();
        try(Connection con=DriverManager.getConnection(url,user,password); Statement st=con.createStatement();
            PreparedStatement prep=con.prepareStatement("SELECT * FROM apartments WHERE "+paramName+operator+" ?") ) {

//            prep.setString(1,paramName);
            prep.setInt(1,queryParam);

            ResultSet res=prep.executeQuery();
            ResultSetMetaData md=res.getMetaData();
            System.out.println(md.getColumnCount());

            while (res.next()){
                System.out.println(res.getString("adres")+"!!!!!!!!!");
                String adres=res.getString("adres");
                String district=res.getString("district");
                Double area=res.getDouble("area");
                int roomNum=res.getInt("roomNum");
                Double prise=res.getDouble("price");

                Apartment tempApp=new Apartment(adres,district,area,roomNum,prise);
                result.add(tempApp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<Apartment> getAppartment(String param, String paramName) {

        List<Apartment> result=new ArrayList<>();
        try(Connection con=DriverManager.getConnection(url,user,password); Statement st=con.createStatement();

            PreparedStatement prep=con.prepareStatement("SELECT * FROM Apartments WHERE "+paramName+" LIKE ?") ) {

            prep.setString(1,"%"+param+"%");

            ResultSet res=prep.executeQuery();

            while (res.next()){

                String adres=res.getString("adres");
                String district=res.getString("district");
                Double area=res.getDouble("area");
                int roomNum=res.getInt("roomNum");
                Double prise=res.getDouble("price");

                Apartment tempApp=new Apartment(adres,district,area,roomNum,prise);
                result.add(tempApp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

//    @Override
//    public List<Apartment> getAppartment(double parametr, String paramName, String operator) {
//        List<Apartment> result=new ArrayList<>();
//        try(Connection con=DriverManager.getConnection(url,user,password); Statement st=con.createStatement();
//            PreparedStatement prep=con.prepareStatement("SELECT * FROM Apartments WHERE"+paramName+operator+" ?") ) {
//
//            prep.setDouble(1,parametr);
//
//            ResultSet res=prep.executeQuery();
//
//            while (res.next()){
//
//                String adres=res.getString("adres");
//                String district=res.getString("district");
//                Double area=res.getDouble("area");
//                int roomNum=res.getInt("roomNum");
//                Double prise=res.getDouble("price");
//
//                Apartment tempApp=new Apartment(adres,district,area,roomNum,prise);
//                result.add(tempApp);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return result;
//    }

    @Override
    public List<Apartment> getAppartment() {

        List<Apartment> result=new ArrayList<>();
        try(Connection con=DriverManager.getConnection(url,user,password); Statement st=con.createStatement()) {

            ResultSet res=st.executeQuery("SELECT * FROM Apartments");

            while (res.next()){

                String adres=res.getString("adres");
                String district=res.getString("district");
                Double area=res.getDouble("area");
                int roomNum=res.getInt("roomNum");
                Double prise=res.getDouble("price");

                Apartment tempApp=new Apartment(adres,district,area,roomNum,prise);
                result.add(tempApp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }


}
