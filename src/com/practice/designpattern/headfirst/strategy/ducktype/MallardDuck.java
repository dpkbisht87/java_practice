package com.practice.designpattern.headfirst.strategy.ducktype;

import com.practice.designpattern.headfirst.strategy.Duck;
import com.practice.designpattern.headfirst.strategy.behavior.fly.FlyBehavior;
import com.practice.designpattern.headfirst.strategy.behavior.fly.FlyWithWings;
import com.practice.designpattern.headfirst.strategy.behavior.quack.Quack;
import com.practice.designpattern.headfirst.strategy.behavior.quack.QuackBehavior;

public class MallardDuck extends Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard duck");
    }
}
