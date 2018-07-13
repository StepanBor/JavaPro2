package com.gmail.stepan1983;

public class Apartment {

    private String address;
    private String district;
    private double area;
    private int roomNum;
    private double price;

    public Apartment(String address, String district, double area, int roomNum, double price) {
        this.address = address;
        this.district = district;
        this.area = area;
        this.roomNum = roomNum;
        this.price = price;
    }

    public Apartment() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", area=" + area +
                ", roomNum=" + roomNum +
                ", price=" + price +
                '}';
    }
}
