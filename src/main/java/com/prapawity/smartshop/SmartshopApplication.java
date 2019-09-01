package com.prapawity.smartshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableAutoConfiguration
public class SmartshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartshopApplication.class, args);
    }


    private String test(){
        return  "eiei";
    }

    @RequestMapping("/")
    String Home(){
        return test();
    }

    @RequestMapping("/method")
    String Cart(){
        return "Cart<button>TEST</button>";
    }

}
