package com.practice.designpattern.headfirst.decorator;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription(){
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .3;
    }
}
