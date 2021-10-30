package com.practice.solid.openclosed;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Circle circle = new Circle(3);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);

        System.out.println(getArea(shapes));
    }

    public static double getArea(List<Shape> shapes){
        double area = 0;
        for (Shape shape: shapes) {
            area += shape.area();
            System.out.println(area);
        }
        return area;
    }
}
