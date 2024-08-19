package com.example.animalappapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class AnimalController {

    @GetMapping
    public String welcome() {
        return "Welcome to the world of animals.";
    }

    @GetMapping("/animals")
    public Map<String, String> getAnimals() {
        Map<String, String> response = new HashMap<>();
        response.put("animals", "tiger");
        return response;
    }
}
