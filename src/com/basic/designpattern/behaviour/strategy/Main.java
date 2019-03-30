package com.basic.designpattern.behaviour.strategy;

public class Main {
    public static void main(String[] args) {
        Context discountContext = new Context(new EasterDiscount());
        Double discountedValue = discountContext.getPrice(200);
        System.out.println(discountedValue);

        discountContext = new Context(new ChristmasDiscount());
        discountedValue = discountContext.getPrice(200);
        System.out.println(discountedValue);
    }
}
