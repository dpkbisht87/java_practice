package com.practice.solid.openclosed;

public class Rectangle extends Shape{
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double height;

    @Override
    public double area() {
        return width * height;
    }
}

