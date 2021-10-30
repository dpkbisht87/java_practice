package com.practice.designpattern.headfirst.strategy;

import com.practice.designpattern.headfirst.strategy.behavior.fly.FlyBehavior;
import com.practice.designpattern.headfirst.strategy.behavior.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float.");
    }
}
