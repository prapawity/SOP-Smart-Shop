package com.prapawity.smartshop.model;

import java.util.ArrayList;
import java.util.List;

public class ListPets {
    public static Animals[] allAnimals = new Animals[]{
            new Animals(1,typeAnimals.Dog,"Barton",122.0,2),
            new Animals(2,typeAnimals.Pig,"Tony",500.0,1),
            new Animals(3,typeAnimals.Cat,"Steve",50.0,5),
            new Animals(4,typeAnimals.Snake,"Steve",50.0,5),
            new Animals(5,typeAnimals.Alligator,"Roger",1000.0,7),
            new Animals(6,typeAnimals.Cow,"That",1200.0,10),
            new Animals(7,typeAnimals.Hamster,"Hacker",15.0,1),
            new Animals(8,typeAnimals.Dog,"Netty",150.0,2),
            new Animals(9,typeAnimals.Pig,"Rawit",520.0,1),
            new Animals(10,typeAnimals.Cat,"Junior",70.0,5),
            new Animals(11,typeAnimals.Snake,"First",90.0,5),
            new Animals(12,typeAnimals.Alligator,"Spy",1300.0,5),
            new Animals(13,typeAnimals.Cow,"Pachorn",1500.0,11),
            new Animals(14,typeAnimals.Hamster,"Pok",12.0,1),

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
