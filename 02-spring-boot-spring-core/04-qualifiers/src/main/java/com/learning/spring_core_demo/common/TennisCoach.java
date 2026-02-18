package com.learning.spring_core_demo.common;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: Thulasi rajan
 * Github: (https://github.com/itsgeniuS)
 * Created on: 18/02/26
 **/

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Tennis: Practice backhand volley!";
    }

    @Override
    public List<String> getAllWorkOuts() {
        return List.of(
                "Tennis",
                "Back hand",
                "Front hand",
                "Serve"
        );
    }
}
