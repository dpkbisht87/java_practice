package com.practice.designpattern.headfirst.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
