package com.sandesh.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication:This enables autoconfiguration, component scanning, and allows to define additional configuration with spring boot.
// And really behind the scenes, this @SpringBootApplication annotation is composed of following 3 annotations:
// 1. @EnableAutoConfiguration - Enables Spring Boot’s autoconfiguration support.
// 2. @ComponentScan - Enables component scanning of current package. Also, recursively scans all the sub-packages as well.
// 3. @Configuration - Able to register extra beans with @Bean or import other configuration classes.
@SpringBootApplication(
        // explicitly specifying the base packages to scan for spring components (beans).
        scanBasePackages = {
                "com.sandesh.springcoredemo",
                "com.sandesh.util"
        })
public class SpringcoredemoApplication {

	public static void main(String[] args) {
        // This allows us to bootstrap our spring boot application, and then we give a reference here to the actual name of our class(i.e. SpringcoredemoApplication.class) and the command line arguments.
        // So behind the scenes:
        // - It creates the application context and registers all the spring beans.
        // - It also starts the embedded web server (like Tomcat etc...) by default.
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}
}
