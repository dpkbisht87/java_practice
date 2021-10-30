package com.practice.designpattern.headfirst.factory;

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(){
        name = "Chicago Style Clam pizza";
        dough = "Extra Thick crust dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cut in square slices");
    }
}
