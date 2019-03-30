package com.basic.designpattern.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getINSTANCE().getFactory(false);
        Shape shape1 = shapeFactory.getShape("Square");
        shape1.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getINSTANCE().getFactory(true);
        Shape shape2 = shapeFactory2.getShape("Square");
        shape2.draw();
    }
}
