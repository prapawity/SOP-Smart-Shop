package com.prapawity.smartshop.model;


import com.prapawity.smartshop.Controller.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalFactory {

    @Autowired
    public static AnimalRepository animalRepository;

    public static Animals createDog(Animals animals){
        Animals animal = new Animals(typeAnimals.Dog,animals.getAnimalsname(),animals.getPrice(),animals.getAge());
        animalRepository.save(animal);
        return animal;
    }

    public Animals createCat(String animalsName, Double price, int age){
        Animals animals = new Animals(typeAnimals.Cat,animalsName,price,age);
        animalRepository.save(animals);
        return animals;
    }

    public Animals createHamster(String animalsName, Double price, int age){
        Animals animals = new Animals(typeAnimals.Hamster,animalsName,price,age);
        animalRepository.save(animals);
        return animals;
    }

    public Animals createSnake(String animalsName, Double price, int age){
        Animals animals = new Animals(typeAnimals.Snake,animalsName,price,age);
        animalRepository.save(animals);
        return animals;
    }

    public Animals createPig(String animalsName, Double price, int age){
        Animals animals = new Animals(typeAnimals.Dog,animalsName,price,age);
        animalRepository.save(animals);
        return animals;
    }

    public Animals createCow(String animalsName, Double price, int age){
        Animals animals = new Animals(typeAnimals.Cow,animalsName,price,age);
        animalRepository.save(animals);
        return animals;
    }

    public Animals createAlligator(String animalsName, Double price, int age){
        Animals animals = new Animals(typeAnimals.Alligator,animalsName,price,age);
        animalRepository.save(animals);
        return animals;
    }



}
