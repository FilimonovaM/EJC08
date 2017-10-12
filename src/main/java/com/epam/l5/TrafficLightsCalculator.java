package com.epam.l5;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Admin on 012 12.10.17.
 */
public class TrafficLightsCalculator {
    private String[] trafficLights = new String[]{"RED", "RED", "YELLOW", "YELLOW", "YELLOW",
            "GREEN", "GREEN", "GREEN", "GREEN", "GREEN"};
    private int enteredInt;
    private int minuetsPerHoure = 60;
    private StringBuilder stringBuilder;

    /**
     * uses for read the number of second & write the answer
     *
     * @param reader is an object of BufferedReader
     */
    void reader(BufferedReader reader) {
        stringBuilder = new StringBuilder();
        System.out.println("Enter the number");
        try {
            stringBuilder.setLength(0);
            stringBuilder.append(reader.readLine());
            checker();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /**
     * uses for checking of status of the stringBuilder object
     */
    void checker() {
        try {
            enteredInt = Integer.parseInt(stringBuilder.toString());
            if (enteredInt < 0) {
                System.out.println("It is a negative number");
            } else {
                System.out.println(answer(enteredInt).toString());
            }
        } catch (NumberFormatException e) {
            System.out.println("It is not a number");
        }
    }

    /**
     * uses for searching information about the color
     *
     * @param enteredInt is the choozen second
     * @return stringBuilder whith information about a color of TrafficLights to reader()
     */
    private StringBuilder answer(int enteredInt) {
        stringBuilder.setLength(0);
        if (enteredInt > minuetsPerHoure) {
            enteredInt -= enteredInt / minuetsPerHoure * minuetsPerHoure;
        }
        if (enteredInt >= trafficLights.length) {
            enteredInt -= enteredInt / trafficLights.length * trafficLights.length;
            ;
        }
        stringBuilder = stringBuilder.append(trafficLights[enteredInt]);
        return stringBuilder;
    }
}
