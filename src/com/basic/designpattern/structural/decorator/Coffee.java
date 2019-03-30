package com.basic.designpattern.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends BaseBeverage {

    public Coffee(String name) {
        super(name);
    }

    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public List<String> GetIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Coffee");
        return ingredients;
    }
}
