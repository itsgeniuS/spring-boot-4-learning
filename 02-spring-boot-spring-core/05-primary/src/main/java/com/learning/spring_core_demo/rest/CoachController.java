package com.learning.spring_core_demo.rest;

import com.learning.spring_core_demo.common.Coach;
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

    private final Coach coach;

    @Autowired
    public CoachController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/getAllDailyWorkouts")
    public List<String> getDailyWorkouts() {
        return coach.getAllWorkOuts();
    }
}
