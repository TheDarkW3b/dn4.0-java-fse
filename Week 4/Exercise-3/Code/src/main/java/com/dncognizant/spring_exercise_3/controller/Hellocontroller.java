package com.dncognizant.spring_exercise_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
