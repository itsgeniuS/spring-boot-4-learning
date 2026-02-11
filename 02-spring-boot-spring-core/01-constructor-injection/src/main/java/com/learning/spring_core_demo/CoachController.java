package com.learning.spring_core_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: Thulasi rajan
 * Github: (https://github.com/itsgeniuS)
 * Created on: 11/02/26
 **/

@RestController
public class CoachController {

    final CricketCoach cricketCoach;

    //constructor for dependency injection
    //autowired tells to dependency injection
    //if we have single parameter on the constructor, then AutoWired is optional
    @Autowired
    CoachController(CricketCoach cricketCoach) {
        this.cricketCoach = cricketCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return cricketCoach.getDailyWorkout();
    }

    @GetMapping("/getAllDailyWorkouts")
    public List<String> getDailyWorkouts() {
        return cricketCoach.getAllWorkOuts();
    }
}
