package com.basic.designpattern.structural.decorator;

import java.util.List;

public abstract class BaseBeverage {
    protected String name = "";

    public BaseBeverage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getCost();

    public abstract List<String> GetIngredients();
}
