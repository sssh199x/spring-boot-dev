package com.sandesh.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// the @Primary annotation is used to give higher preference to this bean when multiple beans of the same type are present.
// the @Primary annotation can be placed on any bean definition to indicate that it should be the default choice for autowiring.
// we cannot use @Primary on two beans of the same type, as it will lead to a conflict.
@Primary
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
