package com.gmail.stepan1983;

public class Dish {

    private String dishName;
    private double weight;
    private double price;
    private double discount;

    public Dish(String dishName, double weight, double price, double discount) {
        this.dishName = dishName;
        this.weight = weight;
        this.price = price;
        this.discount = discount;
    }

    public Dish() {
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
