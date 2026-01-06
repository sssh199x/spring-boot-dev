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
    private Coach anotherCoach;

    // Default scope is Singleton.
    // All dependency injections for the bean will reference the SAME bean.

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach myCoach,
            @Qualifier("cricketCoach") Coach anotherCoach
    ) {
        System.out.println("In Constructor:" + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    // expose a new endpoint for "/dailyworkout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    // expose a new endpoint for "/check" to see if both beans are the same, if its Singleton scope then the result will be true but if its prototype scope then the result will be false.
    @GetMapping("/check")
    public String check(){
        return "Comparing Beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}

