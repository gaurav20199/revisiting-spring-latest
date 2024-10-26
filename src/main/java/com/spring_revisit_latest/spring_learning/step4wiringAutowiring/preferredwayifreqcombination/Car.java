package com.spring_revisit_latest.spring_learning.step4wiringAutowiring.preferredwayifreqcombination;

import com.spring_revisit_latest.spring_learning.step4wiringAutowiring.Engine;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private String model;
    private double price;
    private final Engine engine;

    // If only one constructor then Autowired annotation is not required.
    Car(Engine engine) {
        this.engine = engine;
    }

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
}
