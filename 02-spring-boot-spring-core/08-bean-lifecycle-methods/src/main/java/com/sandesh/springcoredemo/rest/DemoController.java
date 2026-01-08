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

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach myCoach
    ) {
        System.out.println("In Constructor:" + getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    // expose a new endpoint for "/dailyworkout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

