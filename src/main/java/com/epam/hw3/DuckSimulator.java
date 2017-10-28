package com.epam.hw3;

import com.epam.hw3.duckyDuck.Duck;
import com.epam.hw3.duckyDuck.DuckSculpture;
import com.epam.hw3.duckyDuck.RedHetDuck;
import com.epam.hw3.duckyHuman.DuckFaceChick;
import com.epam.hw3.duckyHuman.HomoSapience;

/**
 * It created to show a differences of duck`s behavior in our hypothetical farm
 *
 * @author Filimonova Margarita
 */
public class DuckSimulator {

    /**
     * uses for initialization of configurations for three hypothetical ducks
     * to begin the work of application.
     */
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        try {
            FarmLoader farmLoader = new FarmLoader();
            Duck redHetDuck= new RedHetDuck();
            Duck duckSculpture = new DuckSculpture();
            HomoSapience duckFaceChick= new DuckFaceChick();
            farmLoader.loadTheFarmComponents(redHetDuck , duckSculpture, duckFaceChick );
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
