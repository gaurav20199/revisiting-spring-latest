package com.spring_revisit_latest.spring_learning.step6.singletonwithlazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Car {
    private String modelNo;
    private String price;

    public Car() {
        System.out.println("Instance is created");
    }
}
