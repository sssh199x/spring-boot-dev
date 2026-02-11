package com.sandesh.cruddemo;

import com.sandesh.cruddemo.dao.StudentDAO;
import com.sandesh.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    {/*
    Command Line Runner is from the Spring Boot framework. It is used to execute code after the Spring Boot application has started i.e. after the Spring Beans have been loaded.
    It is typically used to run some initialization logic or to perform some actions at startup.
    If we see this after starting our Spring Boot application, it means that the database connection has been successfully established and the HikariCP connection pool is ready to use.
    [main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@76a805b7
    [main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
    */
    }

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            createStudent(studentDAO);
        };
    }


    private void createStudent(StudentDAO studentDAO) {
        // create the student object
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Sandesh", "Hamal", "sandeshhamal5890@gmail.com");
        // save the student object
        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);
        // display id of the saved student
        System.out.println("Saved student. Generated id: " + tempStudent.getId());
    }

}
