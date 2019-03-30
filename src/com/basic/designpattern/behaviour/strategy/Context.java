package com.basic.designpattern.behaviour.strategy;

public class Context {
    private Discount discount;

    public Context(Discount discount) {
        this.discount = discount;
    }

    public double getPrice(double amount) {
        return discount.applyDiscount(amount);
    }
}
