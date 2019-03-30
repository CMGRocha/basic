package com.basic.designpattern.structural.decorator;

public abstract class ExtraDecorator extends BaseBeverage {

    public ExtraDecorator(BaseBeverage baseBeverage) {
        super(baseBeverage.name);
    }

}
