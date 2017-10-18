package com.epam.hw3;

import com.epam.hw3.typesOfFlight.FlyByPlaneLikeACapriciousWoman;
import com.epam.hw3.typesOfFlight.FlyByWetFantasies;
import com.epam.hw3.typesOfFlight.FlyWithWings;

public class DuckSimulator {

    /**
     * uses for loading configurations of three hypothetical ducks & start the application
     */
    public static void main(String[] args) {
        //Red Hed duck`s block of code
        Duck redHetDuck = new RedHetDuck();
        redHetDuck.display();
        redHetDuck.performQuak();
        redHetDuck.performFly();
        redHetDuck.performSwim();
        System.out.println();
        //The sculpture`s of duck block of code
        Duck duckSculpture = new DuckSculpture();
        duckSculpture.display();
        duckSculpture.performFly();
        duckSculpture.performQuak();
        duckSculpture.performSwim();
        System.out.println();
        //Block of the code to load configuration of the one very strange woman
        HomoSapience duckFaceChick = new DuckFaceChick();
        duckFaceChick.presentHerself();
        duckFaceChick.performFly();
        duckFaceChick.setFlyBehavior(new FlyByWetFantasies());
        duckFaceChick.performFly();
        duckFaceChick.performSpeak();
        duckFaceChick.performSwim();
    }
}
