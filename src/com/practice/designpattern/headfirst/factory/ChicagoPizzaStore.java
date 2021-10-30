package com.practice.designpattern.headfirst.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if(type.equalsIgnoreCase("clam")){
            return new ChicagoStyleClamPizza();
        } else return null;
    }
}
