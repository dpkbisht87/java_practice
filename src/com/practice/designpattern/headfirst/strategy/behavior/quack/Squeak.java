package com.practice.designpattern.headfirst.strategy.behavior.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak..");
    }
}
