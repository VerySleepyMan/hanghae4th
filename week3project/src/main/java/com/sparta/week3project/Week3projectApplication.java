package com.sparta.week3project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week3projectApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3projectApplication.class, args);
    }

}
