package com.practice.designpattern.headfirst.factory;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase("clam")){
            return new NYStyleClamPizza();
        } else return null;
    }
}
