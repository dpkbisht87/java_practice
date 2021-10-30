package com.practice.designpattern.headfirst.decorator;

public abstract class Beverage {
    String description = "Unknown Drink";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
