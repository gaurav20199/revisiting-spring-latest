package com.spring_revisit_latest.spring_learning.step3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Step3Config.class);
        Car carObj = context.getBean(Car.class);
        System.out.println(carObj); // if postconstruct is not used all instance variable values will be null or default values
    }
}
