package com.example.learningone.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
//    To have a bean
    @Bean
    CommandLineRunner commandLineRunner(StudentRepo repo) {
        return args -> {
           Student daniel =  new Student(
                    "Daniel",
                    "Y@gmai.com",
                    LocalDate.of(2000, Month.DECEMBER, 10)
            );

           Student sam =  new Student(
                    "Sam",
                    "X@gmai.com",
                    LocalDate.of(1990, Month.FEBRUARY, 20)
            );

           repo.saveAll(List.of(daniel, sam));
        };
    }
}
