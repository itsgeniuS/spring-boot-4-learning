package com.learning.spring_core_demo.common;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: Thulasi rajan
 * Github: (https://github.com/itsgeniuS)
 * Created on: 11/02/26
 **/

@Component
public class AthleticsCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Athlete : run 5k :B";
    }

    @Override
    public List<String> getAllWorkOuts() {
        return List.of(
                "Athlete",
                "Running",
                "Jogging",
                "Leg workouts"
        );
    }
}
