package com.practice.designpattern.headfirst.factory;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NY Style pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggaiano Cheese");
    }
}
