package com.spring_revisit_latest.spring_learning.step6.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Application is loaded");
        CarPrototype bean1 = context.getBean(CarPrototype.class);
        CarPrototype bean2 = context.getBean(CarPrototype.class);
        CarPrototype bean3 = context.getBean(CarPrototype.class);
        System.out.println(bean1==bean2 || bean2==bean3 || bean1==bean3);
    }
}
