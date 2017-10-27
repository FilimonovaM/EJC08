package com.epam.hw3;

import com.epam.hw3.duckyDuck.Duck;
import com.epam.hw3.duckyDuck.DuckSculpture;
import com.epam.hw3.duckyDuck.RedHetDuck;
import com.epam.hw3.duckyHuman.DuckFaceChick;
import com.epam.hw3.duckyHuman.HomoSapience;
import com.epam.hw3.typesOfFlight.FlyByStrangeFantasies;
import com.epam.hw3.typesOfFlight.FlyNoWay;
import com.epam.hw3.typesOfNoise.MuteQuak;
import com.epam.hw3.typesOfSwimming.SwimLikeTheAxe;

/**
 * It created to show a differences of duck`s behavior in our hypothetical farm
 *
 * @author Filimonova Margarita
 */
public class DuckSimulator {

    /**
     * uses for initialization of class to begin the work of application.
     */
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.loadTheFarm();
    }

    /**
     * uses for loading configurations of three hypothetical ducks & start the application.
     */
    public void loadTheFarm(){
        //Red Hed duck`s block of code
        Duck redHetDuck = new RedHetDuck();
        redHetDuck.display();
        redHetDuck.performQuak();
        redHetDuck.performFly();
        redHetDuck.performSwim();
        System.out.println();

        //The sculpture of duck
        Duck duckSculpture = new DuckSculpture();
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
        HomoSapience duckFaceChick = new DuckFaceChick();
        duckFaceChick.presentHerself();
        duckFaceChick.performFly();
        duckFaceChick.setFlyBehavior(new FlyByStrangeFantasies());//combines different types of relations
        duckFaceChick.performFly();
        duckFaceChick.performSpeak();
        duckFaceChick.performSwim();
    }
}
