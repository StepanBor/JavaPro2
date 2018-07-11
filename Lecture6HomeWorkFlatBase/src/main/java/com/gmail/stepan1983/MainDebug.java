package com.gmail.stepan1983;

public class MainDebug {

    public static void main(String[] args) {

        DataModel dm=new DataModel();

        Apartment ap=new Apartment("hhh", "hghdf",  4542D, 526, 5625);
        Apartment ap2=new Apartment("hhhaasa", "hghdsasss",  454223D, 326, 56325);

//        dm.addAppartment(ap2);

        System.out.println(dm.getAppartment(6000, "price","<="));
        System.out.println(dm.getAppartment("aa","adres"));
        System.out.println(dm.getAppartment());

    }
}
