package com.practice.designpattern.headfirst.strategy;

import com.practice.designpattern.headfirst.strategy.ducktype.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
