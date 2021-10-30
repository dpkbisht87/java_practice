package com.practice.designpattern.headfirst.strategy.behavior.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silence..");
    }
}
