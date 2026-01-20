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

    @GetMapping("/")
    public String sayLaunched() {
        return "Welcome!";
    }
}
