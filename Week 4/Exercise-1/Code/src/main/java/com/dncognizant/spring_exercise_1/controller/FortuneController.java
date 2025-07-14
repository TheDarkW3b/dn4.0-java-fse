package com.dncognizant.spring_exercise_1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class FortuneController {

    private final List<String> fortunes = List.of(
            "Spring ahead with confidence!",
            "A new bean will bloom in your life.",
            "REST easy, your future is scalable.",
            "Today is a perfect day to inject positivity.",
            "Your application context is full of surprises."
    );

    @GetMapping("/fortune")
    public String getFortune() {
        int index = new Random().nextInt(fortunes.size());
        return fortunes.get(index);
    }
}