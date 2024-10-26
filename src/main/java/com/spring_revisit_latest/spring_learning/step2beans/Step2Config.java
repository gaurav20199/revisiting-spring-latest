package com.spring_revisit_latest.spring_learning.step2beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Step2Config {

    @Bean
    Car bmw() {
        Car car = new Car();
        car.setBrand("BMW");
        return car;
    }

    @Bean
    Integer audi() {
        return 6;
    }
}
