package com.spring_revisit_latest.spring_learning.step4wiringAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiWithParameterConfig {

    @Bean(value="marutiEngine")
    Engine createEngine() {
        Engine engine = new Engine();
        engine.setEngineModelNo(124);
        return engine;
    }

    @Bean(value="maruti")
    Car createCar(Engine engine) {  //in very old versions of spring we had to mention the autowired annotation as well
        Car car = new Car();
        car.setBrand("MARUTI");
        car.setEngine(engine);
        return car;
    }
}
