package com.spring_revisit_latest.spring_learning.step4wiringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredExamplesClient {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoWiringConfig.class);
        CarWithFieldInjection carBean = context.getBean(CarWithFieldInjection.class);
        Engine engineBean = context.getBean("marutiEngine", Engine.class);
        System.out.println(carBean.getEngine().getEngineModelNo());
        System.out.println("Is the instance same::"+ (engineBean == carBean.getEngine()));

    }
}
