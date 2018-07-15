package com.gmail.stepan1983;

public class MainDebug {

    public static void main(String[] args) {

        DataInterfase di=new DataBaseModel();

        Product product=new Product("prod1", 11.1, "description 1");

        di.addProduct(product);
    }




}
