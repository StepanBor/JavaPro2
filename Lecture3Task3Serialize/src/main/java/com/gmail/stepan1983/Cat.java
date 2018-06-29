package com.gmail.stepan1983;

public class Cat {

    @Save
    private String name;
    @Save
    private int age;
    @Save
    private CatBreed breed;

    public Cat(String name, int age, CatBreed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CatBreed getBreed() {
        return breed;
    }

    public void setBreed(CatBreed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
}
