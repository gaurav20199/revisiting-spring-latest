package com.spring_revisit_latest.spring_learning.step2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Client2 {
    public static void main(String[] args) {
        ApplicationContext contextWithConfigLoadedFirst = new AnnotationConfigApplicationContext(Step2Config.class,Step2Config2.class);
        ApplicationContext contextWithConfig2LoadedFirst = new AnnotationConfigApplicationContext(Step2Config2.class,Step2Config.class);

        /*
         * Multiple instances of same type
         * If we have multiple instances of same type, and we are retrieving bean using:
         * context.getBean(Car.class); this will result in NoUniqueBeanDefinitionException
         */
        Map<String, Car> beansOfTypeCarWhenConfigLoadedFirst = contextWithConfigLoadedFirst.getBeansOfType(Car.class);
        System.out.println(beansOfTypeCarWhenConfigLoadedFirst);
        Map<String, Car> beansOfTypeCarWhenConfig2LoadedFirst = contextWithConfig2LoadedFirst.getBeansOfType(Car.class);
        System.out.println(beansOfTypeCarWhenConfig2LoadedFirst);

        Map<String, Integer> integerTypeWhenConfigLoadedFirst = contextWithConfigLoadedFirst.getBeansOfType(Integer.class);
        System.out.println(integerTypeWhenConfigLoadedFirst);
        Map<String, Integer> integerTypeWhenConfig2LoadedFirst = contextWithConfig2LoadedFirst.getBeansOfType(Integer.class);
        System.out.println(integerTypeWhenConfig2LoadedFirst);
        /*
            * Above map will return only have 2 entries of Car type for contextWithConfigLoadedFirst and output will be:
            * {bmw=Car{brand='BMW2', model='null', price=0.0}, audi=Car{brand='AUDI', model='null', price=0.0}}
            * Instead of {bmw=Car[{brand='BMW', model='null', price=0.0},{brand='BMW2', model='null', price=0.0}], audi=Car{brand='AUDI', model='null', price=0.0}}
            *
            *
            * When multiple configurations define a bean with the same name, the bean definition from the last configuration loaded will be the one used.
            * Internally, Spring maintains a single BeanDefinition for each bean name. Having multiple definitions for the same name is not allowed.
            * Primary annotation can be used to instruct spring if we want a specific bean to be picked up for two beans having
            * same identifier or same type.
         */

//        Car bmwObj = context.getBean("bmw", Car.class);
//        Car audiObj = context.getBean("audi", Car.class);
//        System.out.println(bmwObj); // will return bmw object having name BMW2
//        System.out.println(audiObj);
//        Integer integerObj = context.getBean("audi", Integer.class);
//
//        System.out.println(integerObj);
    }
}
