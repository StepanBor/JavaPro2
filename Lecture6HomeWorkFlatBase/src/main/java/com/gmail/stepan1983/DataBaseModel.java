package com.gmail.stepan1983;

import java.util.List;

public interface DataBaseModel {

    void addAppartment(Apartment apartment);

    List<Apartment> getAppartment();

    List<Apartment> getAppartment(String param, String paramName);

    List<Apartment> getAppartment(int parametr,String paramName);

    List<Apartment> getAppartment(double parametr, String paramName);

}
