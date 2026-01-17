package com.sandesh.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

    {/*
    Command Line Runner is from the Spring Boot framework. It is used to execute code after the Spring Boot application has started i.e. after the Spring Beans have been loaded.
    It is typically used to run some initialization logic or to perform some actions at startup.
    If we see this after starting our Spring Boot application, it means that the database connection has been successfully established and the HikariCP connection pool is ready to use.
    [main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@76a805b7
    [main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
    */}
    @Bean
    public CommandLineRunner commandLineRunner() {
        return runner -> {
            System.out.println("Hello World from CommandLineRunner!");
        };


    }

}
