package com.epam.hw3;

/**
 * Created by Admin on 017 17.10.17.
 */
public abstract class Duck {
    FlyBehaviore flyBehaviore;
    QuakBehaviore quakBehaviore;

    public abstract void display();
    public void performFly(){
        flyBehaviore.fly();
    }
    public void performQuak(){
        quakBehaviore.quak();
    }
    public void setFlyBehaviore(FlyBehaviore fb){
        flyBehaviore = fb;
    }
    public void setQuakBehaviore(QuakBehaviore qb){
        quakBehaviore = qb;
    }
}
