package com.basic.designpattern.structural.adapter;

public class Main {

    public static void main(String[] args) {
        EUPlugConnector plugConnector = new PortugalPlugConnector();
        UKElectricalSocket electricalSocket = new UKElectricalSocket();
        UKPlugConnector ukAdapter = new EUToUKPlugConnectorAdapter(plugConnector);
        electricalSocket.plugIn(ukAdapter);
    }
}
