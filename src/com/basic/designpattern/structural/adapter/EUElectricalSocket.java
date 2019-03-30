package com.basic.designpattern.structural.adapter;

public class EUElectricalSocket {
    public void plugIn(EUPlugConnector plug) {
        plug.giveElectricity();
    }
}
