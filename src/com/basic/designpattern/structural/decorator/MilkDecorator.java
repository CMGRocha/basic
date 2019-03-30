package com.basic.designpattern.structural.decorator;

import java.util.List;

public class MilkDecorator extends ExtraDecorator {

    private BaseBeverage baseBeverage;

    public MilkDecorator(BaseBeverage baseBeverage) {
        super(baseBeverage);
        this.baseBeverage = baseBeverage;
    }

    @Override
    public double getCost() {
        return baseBeverage.getCost() + 0.2;
    }

    @Override
    public List<String> GetIngredients() {
        List<String> ingredients = baseBeverage.GetIngredients();
        ingredients.add("Milk");
        return ingredients;
    }
}
