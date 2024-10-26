package com.spring_revisit_latest.spring_learning.step2beans;

import org.springframework.context.annotation.Bean;

public class Step2Config3 {
    @Bean("bmwCar")
    Car bmw() {
        Car car = new Car();
        car.setBrand("BMW2");
        return car;
    }

    @Bean(name = "audiCar")
    Car audi() {
        Car car = new Car();
        car.setBrand("AUDI");
        return car;
    }

    @Bean(value = "hondaCar")
    Car honda() {
        Car car = new Car();
        car.setBrand("HONDA");
        return car;
    }
}
