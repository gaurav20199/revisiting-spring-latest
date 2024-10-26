package com.spring_revisit_latest.spring_learning.step7aspects.example2;

import com.spring_revisit_latest.spring_learning.step7aspects.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car car = context.getBean(Car.class);
        car.setPrice("1000");
        System.out.println(car.getModifiedPrice("500"));
    }
}
