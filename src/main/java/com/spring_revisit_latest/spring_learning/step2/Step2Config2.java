package com.spring_revisit_latest.spring_learning.step2;

import org.springframework.context.annotation.Bean;

public class Step2Config2 {

    @Bean
    Car bmw() {
        Car car = new Car();
        car.setBrand("BMW2");
        return car;
    }

    @Bean
    Car audi() {
        Car car = new Car();
        car.setBrand("AUDI");
        return car;
    }
}
