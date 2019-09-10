package com.prapawity.smartshop;
import com.prapawity.smartshop.Controller.AnimalRepository;
import com.prapawity.smartshop.Controller.AnimalService;
import com.prapawity.smartshop.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
/*


 */

@SpringBootApplication
@RestController
public class SmartshopApplication {
    @Autowired
//    AnimalRepository animalRepository;
    AnimalService animalService = new AnimalService();
    public static void main(String[] args) {
        SpringApplication.run(SmartshopApplication.class, args);
    }

    @RequestMapping("/")
    String Home(){
        return "<b>Welcome to Pet Shop</b><br>localhost:port/pets --> to watch all pets<br>localhost:port/pet/{id} --> eg* /pet/1 --> watch pet id = 1<br>localhost:port/update/{id} --> eg* /update/1 --> update pet id = 1<br>localhost:port/delete/{id} --> eg* /delete/1 delete pet id = 1<br>localhost:port/add --> add your data in db";
    }

    @RequestMapping("/pets")
    List<Animals> allAnimals(){
        return animalService.allAnimal();
    }


    @RequestMapping(value = "/pet/{id}", method = RequestMethod.GET)
    public Animals pet(@PathVariable int id){
        return animalService.getAnimal(id);
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    Animals addAnimal(@RequestBody Animals animals){
        animalService.addAnimal(animals);
        return animals;

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String delAnimal(@PathVariable Integer id){
        animalService.delAnimal(id);
        return "Success";

    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    Animals updateAnimal(@RequestBody Animals animals,@PathVariable int id){
        animalService.addAnimal(animals);
        return animals;

    }





}
