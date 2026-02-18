package com.learning.spring_core_demo.rest;

import com.learning.spring_core_demo.common.CricketCoach;
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

    private CricketCoach cricketCoach;

    @Autowired
    public void setCricketCoach(CricketCoach cricketCoach) {
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
