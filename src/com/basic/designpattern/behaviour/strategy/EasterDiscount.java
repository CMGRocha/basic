package com.basic.designpattern.behaviour.strategy;

public class EasterDiscount implements Discount {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.6;
    }
}
