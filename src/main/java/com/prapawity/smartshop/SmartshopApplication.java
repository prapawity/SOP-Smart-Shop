package com.prapawity.smartshop;
import com.prapawity.smartshop.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
/*


 */

@SpringBootApplication
@RestController
//@EnableAutoConfiguration
public class SmartshopApplication {
    ListPets listPets = new ListPets();
    List<Animals> cart = new ArrayList<Animals>();
    public static void main(String[] args) {
        SpringApplication.run(SmartshopApplication.class, args);
    }

    @RequestMapping("/")
    String Home(){
        return "<b>Welcome to Pet Shop</b><br>localhost:port/pets --> to watch all pets<br>localhost:port/pet/type/{menu} --> eg* /pet/type/dog --> watch dog type<br>localhost:port/pet/{id} --> eg* /pet/1 --> watch pet id = 1<br>localhost:port/pet/{id}/order --> eg* /pet/1/order --> add pet id = 1 in the cart<br>localhost:port/cart --> watch pet in the cart";
    }

    @RequestMapping("/pets")
    Animals[] allAnimals(){
        return listPets.getAllAnimals();
    }

    @RequestMapping(value = "/pet/type/{menu}", method = RequestMethod.GET)
    List<Animals> type(@PathVariable String menu){
        switch (menu){
            case "dog":{
                return listPets.getTypeAnimals(1);
            }
            case "cat":{
                return listPets.getTypeAnimals(2);
            }
            case "hamster":{
                return listPets.getTypeAnimals(3);
            }
            case "snake":{
                return listPets.getTypeAnimals(4);
            }
            case "pig":{
                return listPets.getTypeAnimals(5);
            }
            case "cow":{
                return listPets.getTypeAnimals(6);
            }
            case "alligator":{
                return listPets.getTypeAnimals(7);
            }
        }
        return null;

    }

    @RequestMapping(value = "/pet/{id}", method = RequestMethod.GET)
    public Animals pet(@PathVariable int id){
        return listPets.getAnimal(id);
    }

    @RequestMapping(value = "/pet/{id}/order", method = RequestMethod.GET)
    String order(@PathVariable int id){
        cart.add(listPets.getAnimal(id));
        return String.format("Pet ID: %s\nPet's name: %s added in the cart", id,listPets.getAnimal(id).getAnimalsName());
    }

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    List<Animals> cart(){
        return cart;
    }





}
