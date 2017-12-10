package com.epam.vol1.hw3.farm.configuration;

import com.epam.vol1.hw3.farm.birds.duck.Duck;
import com.epam.vol1.hw3.farm.birds.duck.DuckSculpture;
import com.epam.vol1.hw3.farm.birds.duck.RedHetDuck;
import com.epam.vol1.hw3.farm.birds.human.DuckFaceChick;
import com.epam.vol1.hw3.farm.birds.human.HomoSapience;

/**
 * It created to show a differences of birds`s behavior in our hypothetical farm
 *
 * @author Filimonova Margarita
 */
public class DuckSimulator {

    /**
     * uses for initialization of configurations for three hypothetical ducks
     * to begin the work of application.
     */
    public static void main(String[] args) {
        try {
            FarmLoader farmLoader = new FarmLoader();
            Duck redHetDuck = new RedHetDuck();
            Duck duckSculpture = new DuckSculpture();
            HomoSapience duckFaceChick = new DuckFaceChick();
            farmLoader.loadTheFarmComponents(redHetDuck, duckSculpture, duckFaceChick);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
