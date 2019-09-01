package com.prapawity.smartshop.model;
enum typeAnimals {
    Dog,
    Cat,
    Hamster,
    Snake,
    Pig,
    Cow,
    Alligator
}
public class Animals {
    private int ID;
    private typeAnimals type;
    private String animalsName;
    private Double price;
    private int age;

    public int getID() {
        return ID;
    }


    public typeAnimals getType() {
        return type;
    }


    public String getAnimalsName() {
        return animalsName;
    }



    public Animals(int ID, typeAnimals type, String animalsName, Double price, int age) {
        this.ID = ID;
        this.type = type;
        this.animalsName = animalsName;
        this.price = price;
        this.age = age;
    }
}
