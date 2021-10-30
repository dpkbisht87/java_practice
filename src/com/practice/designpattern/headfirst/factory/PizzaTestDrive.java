package com.practice.designpattern.headfirst.factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Eshan ordered : "+ pizza.getName());

        Pizza pizza1 = chicagoPizzaStore.orderPizza("clam");
        System.out.println("Deepak ordered :" + pizza1.getName());
    }
}
