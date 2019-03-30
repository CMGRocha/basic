package com.basic.designpattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
        BaseBeverage coffeeChocolate = new ChocolateDecorator(new CoffeeExtra(new Coffee("Coffee Chocolate")));
        System.out.println(coffeeChocolate.getName());
        System.out.println(coffeeChocolate.getCost());
        System.out.println(coffeeChocolate.GetIngredients());

        BaseBeverage MilkCoffee = new MilkDecorator(new CoffeeExtra(new Coffee("MilkCoffee")));
        System.out.println(MilkCoffee.getName());
        System.out.println(MilkCoffee.getCost());
        System.out.println(MilkCoffee.GetIngredients());
    }
}
