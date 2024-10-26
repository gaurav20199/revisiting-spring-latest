package com.spring_revisit_latest.spring_learning.step4wiringAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WiringConfig {

    @Bean(value="marutiEngine")
    Engine createEngine() {
        Engine engine = new Engine();
        engine.setEngineModelNo(124);
        return engine;
    }

    @Bean(value="maruti")
    Car createCar() {
        Car car = new Car();
        car.setBrand("MARUTI");
        /*
            * Although it might seem that createEngine will be called twice here once when spring will create the instance
            * for it since method is annotated with @Bean and other when spring will be creating the car instance and encounter
            * the createEngine call for setting engine but that is not true. Spring essentially builds aspects over it
            * so directly createEngine is not called. Spring looks for the engine bean in the context, if it's there it
            * directly return that. If it is not there then only Spring creates that.
         */
        car.setEngine(createEngine());
        return car;
    }
}
