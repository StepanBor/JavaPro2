package com.gmail.stepan1983;

import javax.persistence.EntityManagerFactory;
import java.util.List;

public interface DataBaseInterface {

    void addDish(Dish dish, EntityManagerFactory emf);

    List<Dish> getDishByPrice(double lowerPrice, double upperPrice, EntityManagerFactory emf);

    List<Dish> getDishWithDiscount(EntityManagerFactory emf);

    List<Dish> getDishByMaxWeight(double maxWeight, EntityManagerFactory emf);

    List<Dish> getMenu(EntityManagerFactory emf);
}
