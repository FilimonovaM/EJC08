package com.epam.hw3;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck duckMallard = new DuckMallard();
        duckMallard.display();
        duckMallard.performQuak();
        duckMallard.performFly();
        System.out.println();

        Duck redHetDuck = new RedHetDuck();
        redHetDuck.display();
        redHetDuck.performQuak();
        redHetDuck.performFly();
        System.out.println();

        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.performQuak();
        toyDuck.performFly();
        System.out.println();

        Duck duckSculpture = new DuckSculpture();
        duckSculpture.display();
        duckSculpture.performFly();
        duckSculpture.performQuak();
        System.out.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehaviore(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuak();

    }
}
