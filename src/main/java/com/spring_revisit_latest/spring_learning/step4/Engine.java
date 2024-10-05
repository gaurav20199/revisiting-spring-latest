package com.spring_revisit_latest.spring_learning.step4;

public class Engine {
    private int engineModelNo;

    public void start() {
        System.out.println("Engine started");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }

    public int getEngineModelNo() {
        return engineModelNo;
    }

    public void setEngineModelNo(int engineModelNo) {
        this.engineModelNo = engineModelNo;
    }
}
