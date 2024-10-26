package com.spring_revisit_latest.spring_learning.step7aspects.example2;

import com.spring_revisit_latest.spring_learning.step7aspects.ToModify;
import org.springframework.stereotype.Component;

@Component(value = "carBean")
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

    @ToModify
    public String getModifiedPrice(String onRoadPrice) {
        return String.valueOf(Integer.parseInt(onRoadPrice)+Integer.parseInt(this.price));
    }
}
