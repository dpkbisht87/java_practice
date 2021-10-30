package com.practice.designpattern.headfirst.decorator;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.cost() + "$,  " + beverage.getDescription());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.cost() + "$,  " + beverage1.getDescription());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.cost() + "$,  " + beverage2.getDescription());
    }
}
