package com.basic.designpattern.behaviour.template;

public class WoodenHouse extends HouseTemplate {
    @Override
    void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }

    @Override
    void buildFoundation(){
        System.out.println("Building foundation with wood,iron rods and sand");
    }
}
