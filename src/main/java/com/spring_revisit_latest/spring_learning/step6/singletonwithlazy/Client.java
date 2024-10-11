package com.spring_revisit_latest.spring_learning.step6.singletonwithlazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Context is loaded");
        Car bean1 = context.getBean(Car.class);
        Car bean2 = context.getBean(Car.class);
        Car bean3 = context.getBean(Car.class);
        Car bean4 = context.getBean(Car.class);
        System.out.println(bean1==bean2&&bean2==bean3&&bean3==bean4);
    }
}
