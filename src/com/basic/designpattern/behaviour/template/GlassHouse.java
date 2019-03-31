package com.basic.designpattern.behaviour.template;

public class GlassHouse extends HouseTemplate {
    @Override
    void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    void buildPillars() {
        System.out.println("Building pillars with glass coating");
    }
}
