package com.spring_revisit_latest.spring_learning.step4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring_revisit_latest.spring_learning.step4"})
public class AutoWiringConfig {

    @Bean(value="marutiEngine")
    Engine createEngine() {
        Engine engine = new Engine();
        engine.setEngineModelNo(124);
        return engine;
    }

    Car createCar() {
        Car car = new Car();
        car.setBrand("MARUTI");
        car.setEngine(createEngine());
        return car;
    }
}
