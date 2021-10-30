package com.practice.designpattern.headfirst.decorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .2;
    }
}
