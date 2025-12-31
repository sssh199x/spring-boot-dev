package com.sandesh.springcoredemo.rest;

import com.sandesh.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // defining a private field for the dependency.
    private Coach myCoach;

   // Injecting dependency via setter method on our class.
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }
    // Injecting dependency via any method's on our class.
    @Autowired
    public void anyMethodName(Coach theCoach) {
        this.myCoach = theCoach;
    }

    // expose a new endpoint for "/dailyworkout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

