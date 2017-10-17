package com.epam.hw3;

public class ToyDuck extends Duck{
    public ToyDuck(){
        quakBehaviore = new Squeak();
        flyBehaviore = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("It is a little yellow toy duck");
    }
}
