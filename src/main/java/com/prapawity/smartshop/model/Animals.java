package com.prapawity.smartshop.model;

import javax.persistence.*;

enum typeAnimals {
    Dog,
    Cat,
    Hamster,
    Snake,
    Pig,
    Cow,
    Alligator
}

@Entity
public class Animals {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private typeAnimals type;
    private String animalsname;
    private Double price;
    private int age;

    // End Define Var
    public Animals(typeAnimals type, String animalsname, Double price, int age) {
        this.type = type;
        this.animalsname = animalsname;
        this.price = price;
        this.age = age;
}

    public Animals(Animals animals) {
        this.type = animals.type;
        this.animalsname = animals.animalsname;
        this.price = animals.price;
        this.age = animals.age;
    }
    public Animals(){

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public typeAnimals getType() {
        return type;
    }

    public void setType(typeAnimals type) {
        this.type = type;
    }

    public String getAnimalsname() {
        return animalsname;
    }

    public void setAnimalsname(String animalsname) {
        this.animalsname = animalsname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
