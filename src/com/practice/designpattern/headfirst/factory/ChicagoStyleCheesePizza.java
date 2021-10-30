package com.practice.designpattern.headfirst.factory;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style pizza";
        dough = "Extra Thick crust dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cut in square slices");
    }
}
