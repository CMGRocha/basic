package com.basic.designpattern.structural.adapter;

public class PortugalPlugConnector implements EUPlugConnector{
    @Override
    public void giveElectricity() {
        System.out.println("Giving Electricity");
    }
}
