package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoDgApplication {

    @GetMapping("/message")
    public String message() {
        return "Congrats ! your app deplouyed in Azure !";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoDgApplication.class, args);
    }

}
