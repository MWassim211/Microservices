package com.in28minutes.microservices.limitsservice.Bean;

public class LimitConfiguration {
    private int maximum;
    private int minimum;

    public LimitConfiguration(){

    }

    public LimitConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }
    
    public int getMinimum() {
        return this.minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return this.maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

}
