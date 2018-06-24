package com.gmail.stepan1983;

import java.util.Set;
import java.util.TreeSet;

public class MainDebug {
    public static void main(String[] args) {

        Advert adv=new Advert("Helllo", 5,8,"uffj");

        User us=new User(5, "hdfh", "hdsjh");

        Model.addUserToDatabase(us);
        Model.addAdvToDatabase(adv,us);
        Set<Advert> res=Model.getAdvertFromBase();

        System.out.println(res);
        System.out.println(us.getUserId());
    }
}
