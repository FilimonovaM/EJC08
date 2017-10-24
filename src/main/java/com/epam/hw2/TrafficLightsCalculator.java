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
    OperationsWithEnteredSymbols operationsWithEnteredSymbols;

    /**
     * uses for read the number of second & write the answer.
     * <p>
     * <p>
     * this method is connected with the method check(), which uses to check what the symbol was entered </p>
     *
     * @param reader is an object of BufferedReader
     */
    void read(BufferedReader reader) {
        operationsWithEnteredSymbols = new OperationsWithEnteredSymbols();
        System.out.println("Enter the number");
        try {
            enteredInt = operationsWithEnteredSymbols.check(reader.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(answer(enteredInt));
    }

    /**
     * uses for searching information about the color.
     * <p>
     * <p>
     * first "if" is uses to find the shorter digit, if the selected number is more than minutesPerHour</p>
     * <p>
     * second "if" uses to find the index of the color in trafficLights[] for the
     * enteredNumber that is more than trafficLights.length</p>
     *
     * @param enteredInt is the selected second
     * @return information about a color of TrafficLights to reader() in String format
     */
    String answer(int enteredInt) {
        try {
            return trafficLights[(enteredInt > minutes) ? enteredInt % minutes :
                    (enteredInt >= trafficLights.length) ? enteredInt % trafficLights.length : enteredInt];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Negative argument, unacceptable index of array ===> For illegal index \""
                    + e.getMessage() + "\"");
            return (null);
        }

    }
}
