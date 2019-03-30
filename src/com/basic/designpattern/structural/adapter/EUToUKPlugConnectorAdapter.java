package com.basic.designpattern.structural.adapter;

public class EUToUKPlugConnectorAdapter implements UKPlugConnector {
    private EUPlugConnector plug;

    public EUToUKPlugConnectorAdapter(EUPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }
}
