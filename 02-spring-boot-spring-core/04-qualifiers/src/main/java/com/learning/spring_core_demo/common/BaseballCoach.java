package com.learning.spring_core_demo.common;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: Thulasi rajan
 * Github: (https://github.com/itsgeniuS)
 * Created on: 11/02/26
 **/

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "BaseBall: Practice power hitting!";
    }

    @Override
    public List<String> getAllWorkOuts() {
        return List.of(
                "baseball",
                "Spring",
                "High Jump",
                "Catching"
        );
    }
}
