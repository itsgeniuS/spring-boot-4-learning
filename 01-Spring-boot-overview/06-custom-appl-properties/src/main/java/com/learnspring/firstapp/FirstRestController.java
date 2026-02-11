package com.learnspring.firstapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Thulasi rajan
 * Github: (https://github.com/itsgeniuS)
 * Created on: 19/01/26
 **/

@RestController
public class FirstRestController {

    @Value("${external.privacy.url}")
    private String privacyUrl;

    @Value("${external.flutter.url")
    private String flutterUrl;

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

    //endpoint will return the url's in the application.properties
    @GetMapping("/get-privacy-url")
    public String getPrivacyUrl() {
        return privacyUrl;
    }

    //endpoint will return the url's in the application.properties
    @GetMapping("/get-flutter-url")
    public String getFlutterUrl() {
        return flutterUrl;
    }
}
