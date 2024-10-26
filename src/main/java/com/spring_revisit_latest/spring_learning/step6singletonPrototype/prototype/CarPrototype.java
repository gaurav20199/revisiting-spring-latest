package com.spring_revisit_latest.spring_learning.step6singletonPrototype.prototype;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CarPrototype {
    private String modelNo;
    private String price;

    public CarPrototype() {
        System.out.println("Instance is created::"+this);
    }
}
