package com.gmail.stepan1983;

import java.util.Objects;

public class Product {

    private String productName;
    private double price;
    private String description;

    private int productId;

    public Product(String productName, double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getProductId() == product.getProductId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getProductId());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
