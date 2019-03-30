package com.basic.designpattern.structural.decorator;

import java.util.List;

public class ChocolateDecorator extends ExtraDecorator{
    private BaseBeverage baseBeverage;

    public ChocolateDecorator(BaseBeverage baseBeverage) {
        super(baseBeverage);
        this.baseBeverage = baseBeverage;
    }

    @Override
    public double getCost() {
        return baseBeverage.getCost() + 0.6;
    }

    @Override
    public List<String> GetIngredients() {
        List<String> ingredients = baseBeverage.GetIngredients();
        ingredients.add("Chocolate");
        return ingredients;
    }
}
