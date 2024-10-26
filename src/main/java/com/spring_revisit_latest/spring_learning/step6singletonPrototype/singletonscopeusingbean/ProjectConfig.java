package com.spring_revisit_latest.spring_learning.step6singletonPrototype.singletonscopeusingbean;

import com.spring_revisit_latest.spring_learning.step6singletonPrototype.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(value = "bmw")
    Car car() {
        Car car = new Car();
        car.setModel("BMW");
        return car;
    }
}
