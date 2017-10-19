package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;

public class TrafficLightsCalculator {
    private String[] trafficLights = {"RED", "RED", "YELLOW", "YELLOW", "YELLOW",
            "GREEN", "GREEN", "GREEN", "GREEN", "GREEN"}; //You can change it.
    // Nothing will crashed... without the testAnswer()
    private int enteredInt;
    private int minutes = 60; //If you change this param, it will happen... nothing wrong.
    // But you need to update the testAnswer()
    private StringBuilder stringBuilder;
    private OperationsWithEnteredSymbols operationsWithEnteredSymbols;

    /**
     * uses for read the number of second & write the answer.
     *
     * <p>
     * this method is connected with the method check(), which uses to check what the symbol was entered </p>
     *
     * @param reader is an object of BufferedReader
     */
    protected void read(BufferedReader reader) {
        operationsWithEnteredSymbols = new OperationsWithEnteredSymbols();
        stringBuilder = new StringBuilder();
        System.out.println("Enter the number");
        try {
            enteredInt = operationsWithEnteredSymbols.check(stringBuilder.append(reader.readLine()).toString());
        } catch (IOException e) {
            System.err.println(e);
        }
        stringBuilder.setLength(0);
        if (enteredInt >= 0) {
            System.out.println(answer(enteredInt));
        }
    }

    /**
     * uses for searching information about the color.
     *
     * <p>
     * first "if" is uses to find the shorter digit, if the selected number is more than minutesPerHour</p>
     * <p>
     * second "if" uses to find the index of the color in trafficLights[] for the
     * enteredNumber that is more than trafficLights.length</p>
     *
     * @param enteredInt is the selected second
     * @return information about a color of TrafficLights to reader() in String format
     */
    protected String answer(int enteredInt) {
        if (enteredInt > minutes) {
            enteredInt %= minutes;
        }
        if (enteredInt >= trafficLights.length) {
            enteredInt %= trafficLights.length;
        }
        return trafficLights[enteredInt];
    }
}
