package com.epam.l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights {

    private String[] trafficLights = new String[]{"RED", "RED", "YELLOW", "YELLOW", "YELLOW",
            "GREEN", "GREEN", "GREEN", "GREEN", "GREEN"};
    private int enteredInt;
    private StringBuilder stringBuilder;

    /**
     * uses for starting of traffic lights
     *
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        TrafficLights trafficLights = new TrafficLights();
        trafficLights.stringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        trafficLights.reader(reader);
        reader.close();
    }

    /**
     * uses for read the number of second & write the answer
     *
     * @param reader is an object of reader
     */
    private void reader(BufferedReader reader) {
        System.out.println("Enter the number");

        try {
            stringBuilder.setLength(0);
            stringBuilder.append(reader.readLine());
        } catch (IOException e) {
            System.err.println(e);
        }
        try {
            enteredInt = Integer.parseInt(stringBuilder.toString());
            if (enteredInt < 0) {
                System.out.println("Отрицательное число");
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
     * @return stringBuilder whith information to reader
     */
    private StringBuilder answer(int enteredInt) {
        stringBuilder.setLength(0);
        if (enteredInt % 60 == 0) {
            stringBuilder = stringBuilder.append(trafficLights[0]);
        } else {
            if (enteredInt > 60) {
                enteredInt -= enteredInt / 60 * 60;
            }
            if (enteredInt >= trafficLights.length && enteredInt <= 60) {
                enteredInt -= enteredInt / trafficLights.length * trafficLights.length;;
            }
            stringBuilder = stringBuilder.append(trafficLights[enteredInt]);
        }
        return stringBuilder;
    }
}
