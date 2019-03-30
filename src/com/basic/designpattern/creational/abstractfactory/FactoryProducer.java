package com.basic.designpattern.creational.abstractfactory;

public class FactoryProducer {

    private static FactoryProducer INSTANCE = null;

    private FactoryProducer() {
    }

    public static FactoryProducer getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new FactoryProducer();
        }
        return INSTANCE;
    }

    public AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
