package com.practice.designpattern.headfirst.decorator;

public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
