package com.epam.hw3;

public class RedHetDuck extends Duck{
    public RedHetDuck(){
        quakBehaviore = new Quak();
        flyBehaviore = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("It is a RedHetDuck");
    }
}
