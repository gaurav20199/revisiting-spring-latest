package com.spring_revisit_latest.spring_learning.step4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class CarWithFieldInjection {
    private String brand;
    private String model;
    private double price;
    
    @Autowired
    private Engine engine;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }
}
