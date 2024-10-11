package com.spring_revisit_latest.spring_learning.step6.singletonscopeusingstereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Service1 service1 = context.getBean(Service1.class);
        Service2 service2 = context.getBean(Service2.class);
        System.out.println(service1.getRepository()==service2.getRepository());
    }
}
