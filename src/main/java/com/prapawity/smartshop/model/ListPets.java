package com.prapawity.smartshop.model;

import com.prapawity.smartshop.Controller.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class ListPets {
    public AnimalFactory animalFactory = new AnimalFactory();
    public List<Animals> getAllAnimals() {
        return animalFactory.animalRepository.findAll();
    }

    public Animals getAnimal(int ID){
        return animalFactory.animalRepository.findById(ID).get();
    }
    
    public List<Animals> getTypeAnimals(int inputType){
        List<Animals> output = new ArrayList<Animals>();
        switch (inputType){
            case 1: {
                output = watchType(typeAnimals.Dog);
                break;
            }
            case 2: {
                output = watchType(typeAnimals.Cat);
                break;
            }
            case 3: {
                output = watchType(typeAnimals.Hamster);
                break;
            }
            case 4: {
                output = watchType(typeAnimals.Snake);
                break;
            }
            case 5: {
                output = watchType(typeAnimals.Pig);
                break;
            }
            case 6: {
                output = watchType(typeAnimals.Cow);
                break;
            }
            case 7: {
                output = watchType(typeAnimals.Alligator);
                break;
            }

        }
        return output;
    }

    private List<Animals> watchType(typeAnimals typeAnimal){
        List<Animals> outputs = new ArrayList<Animals>();
        for (Animals item: animalFactory.animalRepository.findAll()
             ) {
            if (item.getType() == typeAnimal){
                outputs.add(item);
            }
        }

        return outputs;

    }

    public ListPets() {
    }

    public Animals addAnimal(Animals animals){

        return animals;
    }
}
