package com.epam.hw3.farm.configuration;

import com.epam.hw3.farm.behavior.flight.FlyByStrangeFantasies;
import com.epam.hw3.farm.behavior.flight.FlyNoWay;
import com.epam.hw3.farm.behavior.noise.MuteQuak;
import com.epam.hw3.farm.behavior.swimming.SwimLikeTheAxe;
import com.epam.hw3.farm.birds.duck.Duck;
import com.epam.hw3.farm.birds.human.HomoSapience;

public class FarmLoader {

    /**
     * uses for loading configurations of three hypothetical ducks & start the application.
     *
     * @param redHetDuck
     * @param duckSculpture
     * @param duckFaceChick
     */
    public void loadTheFarmComponents(Duck redHetDuck, Duck duckSculpture, HomoSapience duckFaceChick)
            throws NullPointerException {
        //Red Hed birds`s block of code
        if (redHetDuck != null && duckSculpture != null && duckFaceChick != null) {
            redHetDuck.display();
            redHetDuck.performQuak();
            redHetDuck.performFly();
            redHetDuck.performSwim();
            System.out.println();

            //The sculpture of birds
            //change a behavior with a setters
            duckSculpture.setSwimBehavior(new SwimLikeTheAxe());
            duckSculpture.setQuakBehavior(new MuteQuak());
            duckSculpture.setFlyBehavior(new FlyNoWay());
            duckSculpture.display();
            duckSculpture.performFly();
            duckSculpture.performQuak();
            duckSculpture.performSwim();
            System.out.println();

            //Block of the code to load configuration of the one very strange woman
            //combines different birds of relations
            duckFaceChick.presentHerself();
            duckFaceChick.performFly();
            duckFaceChick.setFlyBehavior(new FlyByStrangeFantasies());
            duckFaceChick.performFly();
            duckFaceChick.performSpeak();
            duckFaceChick.performSwim();
        } else {
            throw new NullPointerException("The initialization error in " + this.getClass().toString());
        }
    }
}
