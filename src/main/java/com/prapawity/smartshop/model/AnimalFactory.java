package com.prapawity.smartshop.model;


public class AnimalFactory {
    public Animals createDog(int ID, String animalsName, Double price, int age){
        return new Animals(ID,typeAnimals.Dog,animalsName,price,age);
    }

    public Animals createCat(int ID, String animalsName, Double price, int age){
        return new Animals(ID,typeAnimals.Cat,animalsName,price,age);
    }

    public Animals createHamster(int ID, String animalsName, Double price, int age){
        return new Animals(ID,typeAnimals.Hamster,animalsName,price,age);
    }

    public Animals createSnake(int ID, String animalsName, Double price, int age){
        return new Animals(ID,typeAnimals.Snake,animalsName,price,age);
    }

    public Animals createPig(int ID, String animalsName, Double price, int age){
        return new Animals(ID,typeAnimals.Pig,animalsName,price,age);
    }

    public Animals createCow(int ID, String animalsName, Double price, int age){
        return new Animals(ID,typeAnimals.Cow,animalsName,price,age);
    }

    public Animals createAlligator(int ID, String animalsName, Double price, int age){
        return new Animals(ID,typeAnimals.Alligator,animalsName,price,age);
    }



}
