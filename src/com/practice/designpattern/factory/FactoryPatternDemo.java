package com.practice.designpattern.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("CIRCLE");
        s1.draw();

        Shape s2 = shapeFactory.getShape("RECTANGLE");
        s2.draw();

        Shape s3 = shapeFactory.getShape("SQUARE");
        s3.draw();

    }
}
