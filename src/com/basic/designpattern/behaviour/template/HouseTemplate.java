package com.basic.designpattern.behaviour.template;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

    private void buildWindows() {
        System.out.println("Build Glass Windows.");
    }

    abstract void buildWalls();

    abstract void buildPillars();

}
