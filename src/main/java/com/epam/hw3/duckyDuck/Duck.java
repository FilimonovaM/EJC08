package com.epam.hw3.duckyDuck;

import com.epam.hw3.typesOfFlight.FlyBehavior;
import com.epam.hw3.typesOfNoise.MakeASoundBehavior;
import com.epam.hw3.typesOfSwimming.SwimBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    MakeASoundBehavior makeASoundBehavior;
    SwimBehavior swimBehavior;

    /**
     * unrealized version - > uses for personal presentation of the classes which extends from the superclass Duck.
     */
    public abstract void display();

    /**
     * uses for loading connecting this class to the methods from the interface FlyBehavior.
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * uses for loading connecting this class to the methods from the interface MakeASoundBehavior.
     */
    public void performQuak() {
        makeASoundBehavior.speak();
    }

    /**
     * uses for loading connecting this class to the methods from the interface SwimBehavior.
     */
    public void performSwim() {
        swimBehavior.swim();
    }

    /**
     * uses for changing of current value of preparing type of flying.
     *
     * @param flyBehavior - the new value of preparing type of behavior of object
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * uses for changing of current value of preparing type of speaking.
     *
     * @param makeASoundBehavior - the new value of preparing type of behavior of object
     */
    public void setQuakBehavior(MakeASoundBehavior makeASoundBehavior) {
        this.makeASoundBehavior = makeASoundBehavior;
    }

    /**
     * uses for changing of current value of preparing type of swimming.
     *
     * @param swimBehavior - the new value of preparing type of behavior of object
     */
    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
}
