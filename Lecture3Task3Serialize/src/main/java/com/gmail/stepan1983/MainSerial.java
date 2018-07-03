package com.gmail.stepan1983;

import java.io.File;
import java.io.FileNotFoundException;

public class MainSerial {
    public static void main(String[] args) throws FileNotFoundException {

        CatBreed breed=new CatBreed("Angora",10);

        Cat cat=new Cat("Vaska",5,breed);

        File cote=Serializator.serialize(cat,"c:\\");

        Cat cat2=Serializator.deserialize(new Cat(),cote);

        System.out.println(cat2);
    }
}
