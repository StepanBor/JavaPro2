package com.gmail.stepan1983;

import javax.annotation.Generated;
import javax.persistence.*;


@Entity
@Table(name = "menu1")
public class Dish {

    private String name;
    private double weight;
    private double price;
    private double discount;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    public Dish(String name, double weight, double price, double discount) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.discount = discount;
    }

    public Dish() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
