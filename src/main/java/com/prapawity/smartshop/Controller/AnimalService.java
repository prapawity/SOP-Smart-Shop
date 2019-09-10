package com.prapawity.smartshop.Controller;

import com.prapawity.smartshop.model.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public void addAnimal(Animals animals){
        animalRepository.save(animals);
    }

    public List<Animals> allAnimal(){
        List<Animals> list = animalRepository.findAll();
        System.out.print(list);
        return list;
    }

    public Animals getAnimal(int id){
        return animalRepository.findById(id).get();
    }

    public void delAnimal(int id){
        animalRepository.deleteById(id);
    }

    public Animals updateAnimal(Animals animals, int id){
        animalRepository.findById(id).map(animals1 -> {
            animals1.setAge(animals.getAge());
            animals1.setAnimalsname(animals.getAnimalsname());
            animals1.setPrice(animals.getPrice());
            animals1.setType(animals.getType());
            return animals1;
        });
        return animalRepository.findById(id).get();
    }
}
