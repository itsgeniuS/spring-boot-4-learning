package com.learning.spring_core_demo;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: Thulasi rajan
 * Github: (https://github.com/itsgeniuS)
 * Created on: 11/02/26
 **/

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Start running for 15 minutes.";
    }

    @Override
    public List<String> getAllWorkOuts() {
        return List.of(
                "Running",
                "Jogging",
                "Elevation Climbing"
        );
    }
}
