package com.basic.designpattern.structural.adapter;

public class UKElectricalSocket {
    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity();
    }
}
