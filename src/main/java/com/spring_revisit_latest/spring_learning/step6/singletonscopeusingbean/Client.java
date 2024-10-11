package com.spring_revisit_latest.spring_learning.step6.singletonscopeusingbean;

import com.spring_revisit_latest.spring_learning.step6.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car bmw1 = context.getBean("bmw", Car.class);
        Car bmw2 = context.getBean("bmw", Car.class);
        Car bmw3 = context.getBean("bmw", Car.class);
        //This will be true everytime for Bean of Singleton scope no matter how many time requests the bean with same identifier.
        System.out.println(bmw1==bmw2 && bmw2==bmw3);
    }
}
