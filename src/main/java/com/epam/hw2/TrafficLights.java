package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *It answers to user what the color is lighting at the selected moment
 *
 * @author  Filimonova Margarita
 */
public class TrafficLights {

    /**
     * uses for starting of traffic lights.
     *
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        TrafficLightsCalculator trafficLightsCalculator = new TrafficLightsCalculator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        trafficLightsCalculator.read(reader);
        reader.close();
    }
}



