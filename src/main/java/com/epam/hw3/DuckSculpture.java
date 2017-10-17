package com.epam.hw3;

/**
 * Created by Admin on 018 18.10.17.
 */
public class DuckSculpture extends Duck{
    public DuckSculpture(){
        quakBehaviore = new MuteQuak();
        flyBehaviore = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("It is a sculpture of duck");
    }
}
