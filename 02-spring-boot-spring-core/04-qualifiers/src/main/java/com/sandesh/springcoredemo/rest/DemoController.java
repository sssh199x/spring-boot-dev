package com.sandesh.springcoredemo.rest;

import com.sandesh.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // defining a private field for the dependency.
    private Coach myCoach;

    // specify the bean id:(same name as class, but first character lower-case) to be injected using @Qualifier if you have multiple implementations of the interface.
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    // expose a new endpoint for "/dailyworkout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

