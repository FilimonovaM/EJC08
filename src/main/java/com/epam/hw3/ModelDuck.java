package com.epam.hw3;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviore = new FlyNoWay();
        quakBehaviore = new Quak();
    }

    @Override
    public void display() {
        System.out.println("It is a model of duck");
    }
}
