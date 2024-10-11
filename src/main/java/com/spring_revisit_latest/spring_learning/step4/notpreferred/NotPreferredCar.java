package com.spring_revisit_latest.spring_learning.step4.notpreferred;
import com.spring_revisit_latest.spring_learning.step4.Engine;
import org.springframework.beans.factory.annotation.Autowired;

public class NotPreferredCar {
    private String brand;
    private String model;
    private double price;
    private Engine engine;

    @Autowired
    public NotPreferredCar(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
