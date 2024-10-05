package com.spring_revisit_latest.spring_learning.step2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Step2Config.class);
        /*
            *This confirms that spring has put a bean in the context of Car type when we put @Bean over it.
            * If we remove @Bean annotation then we will get NoSuchBeanDefinitionException
            * No qualifying bean of type 'com.spring_revisit_latest.spring_learning.step2.Car' available
         */

        Car car = context.getBean(Car.class);
        System.out.println(car); //not null

        /*
            *This confirms that the method name has been assigned to the bean name by Spring by default.
            * If some other name is provided which is neither provided in @Bean nor in the method name then we will get
            * Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'bmw1' available
         */
        Object bmw = context.getBean("bmw");
        System.out.println(bmw);

//        Object bmw1 = context.getBean("bmw1");
//        System.out.println(bmw1);  // will give exception
    }
}
