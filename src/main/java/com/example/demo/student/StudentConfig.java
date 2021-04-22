package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student juan = new Student (
                    "Juan Carlos",
                    "jcperez@gmail.com",
                    LocalDate.of(2000, Month.MAY, 3)
            );
            Student mariano = new Student (
                    "Mariano",
                    "Mariano@gmail.com",
                    LocalDate.of(2001, Month.MAY, 15)
            );

            repository.saveAll(
                    List.of(juan, mariano)
            );
        };
    }
}
