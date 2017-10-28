package com.epam.hw3;

import com.epam.hw3.duckyDuck.Duck;
import com.epam.hw3.duckyHuman.HomoSapience;

public class FarmLoader {

    /**
     * uses for loading configurations of three hypothetical ducks & start the application.
     * @param redHetDuck
     * @param duckSculpture
     * @param duckFaceChick
     */
    public void loadTheFarmComponents(Duck redHetDuck, Duck duckSculpture, HomoSapience duckFaceChick)
            throws NullPointerException {
        //Red Hed duck`s block of code
        if (redHetDuck != null && duckSculpture != null && duckFaceChick != null) {
            redHetDuck.display();
            redHetDuck.performQuak();
            redHetDuck.performFly();
            redHetDuck.performSwim();
            System.out.println();

            //The sculpture of duck
            //change a behavior with a setters
            duckSculpture.setSwimBehavior(new com.epam.hw3.typesOfSwimming.SwimLikeTheAxe());
            duckSculpture.setQuakBehavior(new com.epam.hw3.typesOfNoise.MuteQuak());
            duckSculpture.setFlyBehavior(new com.epam.hw3.typesOfFlight.FlyNoWay());
            duckSculpture.display();
            duckSculpture.performFly();
            duckSculpture.performQuak();
            duckSculpture.performSwim();
            System.out.println();

            //Block of the code to load configuration of the one very strange woman
            //combines different types of relations
            duckFaceChick.presentHerself();
            duckFaceChick.performFly();
            duckFaceChick.setFlyBehavior(new com.epam.hw3.typesOfFlight.FlyByStrangeFantasies());
            duckFaceChick.performFly();
            duckFaceChick.performSpeak();
            duckFaceChick.performSwim();
        } else {
            throw new NullPointerException("The initialization error in " + this.getClass().toString());
        }
    }
}
