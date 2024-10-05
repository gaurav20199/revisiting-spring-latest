package com.spring_revisit_latest.spring_learning.step3;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private String model;
    private double price;


    @PostConstruct
    void init() {
        this.brand = "BMW";
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
