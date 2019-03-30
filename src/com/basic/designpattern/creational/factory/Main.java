package com.basic.designpattern.creational.factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
