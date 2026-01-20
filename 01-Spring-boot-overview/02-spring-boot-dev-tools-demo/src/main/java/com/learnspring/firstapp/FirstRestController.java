package com.learnspring.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Thulasi rajan
 * Github: (https://github.com/itsgeniuS)
 * Created on: 19/01/26
 **/

@RestController
public class FirstRestController {

    //expose "/" that return a default resposnse
    //localhost:8080
    @GetMapping("/")
    public String sayLaunched() {
        return "Welcome!";
    }

    //expose new endpoint and return a simple string
    //localhost:8080/daily-workout
    @GetMapping("/daily-workout")
    public String getDailyWorkouts() {
        return "Run 10 kms";
    }

    //expose new endpoint and return a simple boolean
    //localhost:8080/is-lucky-day
    @GetMapping("/is-lucky-day")
    public boolean getBoolean() {
        return true;
    }
}
