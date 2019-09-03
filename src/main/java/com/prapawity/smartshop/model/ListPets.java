package com.prapawity.smartshop.model;

import java.util.ArrayList;
import java.util.List;

public class ListPets {
    public static Animals[] allAnimals = new Animals[]{
            new AnimalFactory().createDog(1,"Barton",122.0,2),
            new AnimalFactory().createPig(2,"Tony",500.0,1),
            new AnimalFactory().createCat(3,"Steve",50.0,5),
            new AnimalFactory().createSnake(4,"Steve",50.0,5),
            new AnimalFactory().createAlligator(5,"Roger",1000.0,7),
            new AnimalFactory().createCow(6,"That",1200.0,10),
            new AnimalFactory().createHamster(7,"Hacker",15.0,1),
            new AnimalFactory().createDog(8,"Netty",150.0,2),
            new AnimalFactory().createPig(9,"Rawit",520.0,1),
            new AnimalFactory().createCat(10,"Junior",70.0,5),
            new AnimalFactory().createSnake(11,"First",90.0,5),
            new AnimalFactory().createAlligator(12,"Spy",1300.0,5),
            new AnimalFactory().createCow(13,"Pachorn",1500.0,11),
            new AnimalFactory().createHamster(14,"Pok",12.0,1),

    };

    public static Animals[] getAllAnimals() {
        return allAnimals;
    }

    public Animals getAnimal(int ID){
        for (Animals item: allAnimals) {
            if (item.getID() == ID) return item;
        }
        return null;
    }
    
    public static List<Animals> getTypeAnimals(int inputType){
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
    private static List<Animals> watchType(typeAnimals typeAnimal){
        List<Animals> outputs = new ArrayList<Animals>();
        for (Animals item : allAnimals) {
            if (item.getType() == typeAnimal) {
                outputs.add(item);
            }

        }

        return outputs;

    }

    public static void main(String[] args) {
    }

}
