package com.sandesh.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFunController {
    // injecting values from application.properties file to coachName and teamName fields
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for team info
    @GetMapping("/team-info")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k today!";
    }

    // expose a new endpoint for fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
