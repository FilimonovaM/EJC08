package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;


public class TrafficLightsCalculator {
    private String[] trafficLights = new String[]{"RED", "RED", "YELLOW", "YELLOW", "YELLOW",
            "GREEN", "GREEN", "GREEN", "GREEN", "GREEN"};
    int enteredInt;
    private int minuetsPerHour = 60;
    private StringBuilder stringBuilder;
    private OperationsWithEnteredSymbols operationsWithEnteredSymbols;

    /**
     * uses for read the number of second & write the answer
     *
     * @param reader is an object of BufferedReader
     */
    protected void reader(BufferedReader reader) {
        operationsWithEnteredSymbols = new OperationsWithEnteredSymbols();
        stringBuilder = new StringBuilder();
        System.out.println("Enter the number");
        try {
            enteredInt = operationsWithEnteredSymbols.check((stringBuilder.append(reader.readLine())).toString());
        } catch (IOException e) {
            System.err.println(e);
        }
        stringBuilder.setLength(0);
        if (enteredInt >= 0) {
            System.out.println(answer(enteredInt));
        }
    }

    /**
     * uses for searching information about the color
     *
     * @param enteredInt is the selected second
     * @return information about a color of TrafficLights to reader() in String format
     */
    protected String answer(int enteredInt) {
        if (enteredInt > minuetsPerHour) {
            enteredInt %= minuetsPerHour;
        }
        if (enteredInt >= trafficLights.length) {
            enteredInt %= trafficLights.length;
        }
        return trafficLights[enteredInt];
    }
}
