package com.basic.designpattern.structural.decorator;

import java.util.List;

public class CoffeeExtra extends ExtraDecorator {
    private BaseBeverage baseBeverage;

    public CoffeeExtra(BaseBeverage baseBeverage) {
        super(baseBeverage);
        this.baseBeverage = baseBeverage;
    }

    @Override
    public double getCost() {
        return baseBeverage.getCost() + 2;
    }

    @Override
    public List<String> GetIngredients() {
        List<String> ingredients = baseBeverage.GetIngredients();
        ingredients.add("Extra Coffee");
        return ingredients;
    }
}
