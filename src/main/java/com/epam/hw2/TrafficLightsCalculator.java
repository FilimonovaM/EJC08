package com.epam.hw2;

import com.epam.hw1.*;

import java.io.BufferedReader;
import java.io.IOException;


public class TrafficLightsCalculator {
    private String[] trafficLights = new String[]{"RED", "RED", "YELLOW", "YELLOW", "YELLOW",
            "GREEN", "GREEN", "GREEN", "GREEN", "GREEN"};
    int enteredInt;
    private int minuetsPerHoure = 60;
    private StringBuilder stringBuilder;
    private Operations operations;

    /**
     * uses for read the number of second & write the answer
     *
     * @param reader is an object of BufferedReader
     */
    void reader(BufferedReader reader) {
        operations = new Operations();
        stringBuilder = new StringBuilder();
        System.out.println("Enter the number");
        try {
            stringBuilder.setLength(0);
            enteredInt = operations.check((stringBuilder.append(reader.readLine())).toString());
            if(enteredInt>=0){
                System.out.println(answer(enteredInt).toString());
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }

    /**
     * uses for searching information about the color
     *
     * @param enteredInt is the selected second
     * @return stringBuilder with information about a color of TrafficLights to reader()
     */
    private StringBuilder answer(int enteredInt) {
        stringBuilder.setLength(0);
        if (enteredInt > minuetsPerHoure) {
            enteredInt -= enteredInt / minuetsPerHoure * minuetsPerHoure;
        }
        if (enteredInt >= trafficLights.length) {
            enteredInt -= enteredInt / trafficLights.length * trafficLights.length;
        }
        stringBuilder = stringBuilder.append(trafficLights[enteredInt]);
        return stringBuilder;
    }
}
