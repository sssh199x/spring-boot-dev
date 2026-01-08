package com.sandesh.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes :-)";
    }
    // Define our Custom init method
    // Container started --> Bean is instantiated --> Dependencies are injected --> Internal Spring Processing --> Your Custom Init method (@PostConstruct) is called --> Bean is ready for use --> Container is Shutdown --> Your Custom Destroy method (@PreDestroy) is called --> Bean is destroyed
    // We can add custom code during bean initialization using @PostConstruct
    // 1. Calling custom business logic method
    // 2. Setting up handles to resources like database connections, file handles, sockets etc.
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff():" + getClass().getSimpleName());
    }
    // Define our Custom destroy method
    // We can add custom code during bean destruction using @PreDestroy
    // 1. Calling custom business logic method
    // 2. Clean up handles to resources like database connections, file handles, sockets etc.
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff():" + getClass().getSimpleName());
    }
}
