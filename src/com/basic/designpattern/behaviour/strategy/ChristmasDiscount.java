package com.basic.designpattern.behaviour.strategy;

public class ChristmasDiscount implements Discount {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
