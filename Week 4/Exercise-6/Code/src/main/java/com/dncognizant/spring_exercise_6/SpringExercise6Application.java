package com.dncognizant.spring_exercise_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true)
public class SpringExercise6Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringExercise6Application.class, args);
    }
}
