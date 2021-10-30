package com.practice.designpattern.headfirst.factory;

public abstract class PizzaStore {

    Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
