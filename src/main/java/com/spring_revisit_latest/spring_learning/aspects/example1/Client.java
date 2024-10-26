package com.spring_revisit_latest.spring_learning.aspects.example1;

import com.spring_revisit_latest.spring_learning.aspects.CarAspect;
import com.spring_revisit_latest.spring_learning.aspects.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println(context.getBean(CarAspect.class));
        Car car = context.getBean(Car.class);
        car.setPrice("1000"); //aspect will execute for setter
        car.setModelNo("BMW"); //aspect will execute for setter
        System.out.println("Car object is created");
        System.out.println("Price is::"+car.getPrice()); // aspect for getPrice and aspect for all methods will be executed
        System.out.println("Model Number is::"+car.getModelNo()); //aspect for all methods will be executed
        System.out.println(car.getModifiedPrice("2000")); //aspect for getModifiedPrice and for all methods will be executed. Order might be anything
    }
}
