package com.epam.hw3;

public class DuckMallard extends Duck{
    public DuckMallard(){
        quakBehaviore = new Quak();
        flyBehaviore = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("It is a DuckMallard");
    }
}
