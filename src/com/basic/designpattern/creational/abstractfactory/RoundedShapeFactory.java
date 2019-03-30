package com.basic.designpattern.creational.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "Square":
                return new RoundedSquare();
            case "Rectangle":
                return new RoundedRectangle();
            default:
                return null;
        }
    }
}
