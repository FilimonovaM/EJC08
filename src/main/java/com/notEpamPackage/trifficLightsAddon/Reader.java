package com.notEpamPackage.trifficLightsAddon;

import java.io.BufferedReader;
import java.io.IOException;


public class Reader {
    int enteredInt;
    StringBuilder stringBuilder;

    /**
     * uses for reading of the your special param
     * <p>
     * !!! This method uses the param that you enter, but it can use s default params
     *
     * @param reader uses to give your variant of param to the previous method.
     * @return the entered digit or the -1, if you don`t select a number.
     */
    protected int read(BufferedReader reader) {
        stringBuilder = new StringBuilder();
        System.out.println("Enter the number");
        try {
            stringBuilder = stringBuilder.append(reader.readLine().toString());
            check();
        } catch (IOException e) {
            System.err.println(e);
        }
        stringBuilder.setLength(0);
        return enteredInt;
    }

    /**
     * uses for checking of the your special param - is it a positive number or not. If It is a
     * positive it set this digit to the param enteredInt like a value.
     * If it is not a positive number or 0, it set a special value to the param enteredInt(=-1)
     * <p>
     * !!! This method uses the param that you enter
     */
    protected void check() {
        try {
            enteredInt = Integer.parseInt(stringBuilder.toString());
            if (enteredInt > 0) {
                System.out.println("Selected number is " + enteredInt);
            } else {
                System.out.println("Selected number is negative");
                enteredInt = -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("It is not a number");
            enteredInt = -1;
        }
    }
}
