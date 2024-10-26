package com.spring_revisit_latest.spring_learning.step4wiringAutowiring.notpreferred;

import com.spring_revisit_latest.spring_learning.step4wiringAutowiring.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotPreferredWiringConfig {

    @Bean(value="marutiEngine")
    Engine createEngine() {
        Engine engine = new Engine();
        engine.setEngineModelNo(124);
        return engine;
    }

    @Bean(value="maruti")
    NotPreferredCar createCar(Engine engine) {
        NotPreferredCar car = new NotPreferredCar(engine);
        car.setBrand("MARUTI");
        return car;
    }
}
