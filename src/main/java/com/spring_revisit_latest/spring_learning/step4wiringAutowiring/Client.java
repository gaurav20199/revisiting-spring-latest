package com.spring_revisit_latest.spring_learning.step4wiringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WiringConfig.class);
        // This shows the wiring of the Bean programmatically
        Car carBean = context.getBean("maruti", Car.class);
        Engine engineBean = context.getBean("marutiEngine",Engine.class);
        System.out.println(carBean.getBrand()+","+carBean.getEngine().getEngineModelNo());
        System.out.println("Is the instance same::"+ (engineBean == carBean.getEngine()));

        ApplicationContext contextWithDIParameterInjection = new AnnotationConfigApplicationContext(DiWithParameterConfig.class);
        Car carBean2 = contextWithDIParameterInjection.getBean("maruti", Car.class);
        Engine engineBean2 = contextWithDIParameterInjection.getBean("marutiEngine",Engine.class);
        System.out.println(carBean2.getBrand()+","+carBean2.getEngine().getEngineModelNo());
        System.out.println("Is the instance same::"+ (engineBean2 == carBean2.getEngine()));

    }
}
