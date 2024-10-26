package com.spring_revisit_latest.spring_learning.aspects.example1;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String price;
    private String modelNo;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getModifiedPrice(String onRoadPrice) {
        return String.valueOf(Integer.parseInt(onRoadPrice)+Integer.parseInt(this.price));
    }
}
