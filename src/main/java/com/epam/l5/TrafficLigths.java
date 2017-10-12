package com.epam.l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLigths {

    String[] trafficLights = new String[]{"RED", "RED", "YELLOW", "YELLOW", "YELLOW", "GREEN", "GREEN", "GREEN", "GREEN", "GREEN"};
    private int enteredInt;
    private BufferedReader reader;
    private StringBuilder stringBuilder;

    /**
     * uses for starting of trafficlights
     */
    public static void main(String[] args) {
        TrafficLigths trafficLigths = new TrafficLigths();
        trafficLigths.stringBuilder = new StringBuilder();
        System.out.println();
        trafficLigths.reader();
    }

    /**
     * uses for read the number of second & write the answer
     */
    private void reader() {
        System.out.println("Enter the number");
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            stringBuilder.setLength(0);
            stringBuilder.append(reader.readLine());
        } catch (IOException e) {
            System.err.println(e);
        }
        try {
            enteredInt = Integer.parseInt(stringBuilder.toString());
            System.out.println(answer(enteredInt).toString());
        } catch (NumberFormatException e) {
            System.out.println("It is not a number");
            System.err.println(e);
        }
    }

    /**
     * uses for searching information about the color
     *
     * @param enteredInt is the choozen second
     * @return stringBuilder whith information to reader
     */
    private StringBuilder answer(int enteredInt) {
        int behindOperations;
        int secondBehindOperations;
        stringBuilder.setLength(0);
        if (enteredInt % 60 == 0) {
            stringBuilder = stringBuilder.append("RED");
        } else if (enteredInt < 10) {
            stringBuilder = stringBuilder.append(trafficLights[enteredInt]);
        } else if (enteredInt <= 60) {
            behindOperations = enteredInt / 10 * 10;
            stringBuilder.append(trafficLights[enteredInt - behindOperations]);
        } else {
            behindOperations = enteredInt / 60 * 60;
            secondBehindOperations = enteredInt - behindOperations;
            enteredInt = secondBehindOperations;
            behindOperations = enteredInt / 10 * 10;
            stringBuilder = stringBuilder.append(trafficLights[enteredInt - behindOperations]);
        }
        return stringBuilder;
    }
}
