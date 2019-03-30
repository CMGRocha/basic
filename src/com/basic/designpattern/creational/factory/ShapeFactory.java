package com.basic.designpattern.creational.factory;

public class ShapeFactory {

    public Shape getShape(String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
