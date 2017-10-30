package com.epam.hw3.farm.birds.duck;

import com.epam.hw3.farm.behavior.interfaces.FlyBehavior;
import com.epam.hw3.farm.behavior.interfaces.MakeASoundBehavior;
import com.epam.hw3.farm.behavior.interfaces.SwimBehavior;

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
    public void performFly() throws NullPointerException {
        if (flyBehavior != null) {
            System.out.println(flyBehavior.fly());
        } else {
            throw new NullPointerException("Type of flight is not selected");
        }
    }

    /**
     * uses for loading connecting this class to the methods from the interface MakeASoundBehavior.
     */
    public void performQuak() throws NullPointerException {
        if (makeASoundBehavior != null) {
            System.out.println(makeASoundBehavior.speak());
        } else {
            throw new NullPointerException("Type of quaking is not selected");
        }
    }

    /**
     * uses for loading connecting this class to the methods from the interface SwimBehavior.
     */
    public void performSwim() throws NullPointerException {
        if (swimBehavior != null) {
            System.out.println(swimBehavior.swim());
        } else {
            throw new NullPointerException("Type of swimming is not selected");
        }
    }

    /**
     * uses for changing of current value of preparing type of flying.
     *
     * @param flyBehavior - the new value of preparing type of behavior of object
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) throws NullPointerException {
        if (flyBehavior != null) {
            this.flyBehavior = flyBehavior;
        } else {
            throw new NullPointerException("The illegal argument is received by method setFlyBehavior");
        }
    }

    /**
     * uses for changing of current value of preparing type of speaking.
     *
     * @param makeASoundBehavior - the new value of preparing type of behavior of object
     */
    public void setQuakBehavior(MakeASoundBehavior makeASoundBehavior) throws NullPointerException {
        if (makeASoundBehavior != null) {
            this.makeASoundBehavior = makeASoundBehavior;
        } else {
            throw new NullPointerException("The illegal argument is received by method setQuakBehavior");
        }
    }

    /**
     * uses for changing of current value of preparing type of swimming.
     *
     * @param swimBehavior - the new value of preparing type of behavior of object
     */
    public void setSwimBehavior(SwimBehavior swimBehavior) throws NullPointerException {
        if (swimBehavior != null) {
            this.swimBehavior = swimBehavior;
        } else {
            throw new NullPointerException("The illegal argument is received by method setSwimBehavior");
        }
    }
}
