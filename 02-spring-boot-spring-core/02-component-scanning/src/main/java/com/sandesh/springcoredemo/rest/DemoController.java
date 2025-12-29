package com.sandesh.springcoredemo.rest;

import com.sandesh.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // defining a private field for the dependency.
    private Coach myCoach;

    // define a constructor for dependency injection.
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    // expose a new endpoint for "/dailyworkout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

