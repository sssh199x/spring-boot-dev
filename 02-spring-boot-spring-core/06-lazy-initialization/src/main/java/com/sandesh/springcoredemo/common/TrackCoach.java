package com.sandesh.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// It won't create the bean until it is requested for the first time, making it lazy-initialized.By default, Spring beans are eagerly initialized at the time of application context startup.
// We can also set up global configuration to make all beans lazy-initialized by setting the "spring.main.lazy-initialization" property to "true" in the application.properties file.
@Lazy
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In Constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
