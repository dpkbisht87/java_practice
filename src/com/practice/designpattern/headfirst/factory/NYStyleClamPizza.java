package com.practice.designpattern.headfirst.factory;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza(){
        name = "NY Style clam pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggaiano Cheese");
    }
}
