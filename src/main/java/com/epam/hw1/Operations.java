package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;

public class Operations {
    private StringBuilder stringBuilder;
    private BufferedReader reader;

    Operations(BufferedReader reader) {
        this.reader = reader;
    }

    /**
     * uses for reading
     *
     * @return read line
     * @throws IOException
     */
    public StringBuilder read() throws IOException {
        stringBuilder = new StringBuilder();
        try {
            stringBuilder.setLength(0);
            return stringBuilder.append(reader.readLine());
        } catch (IOException e) {
            System.err.println(e);
            return stringBuilder;
        }
    }

    /**
     * uses for understanding is the line a number or not
     *
     * @param number is a read line
     * @return boolean answer
     */
    public boolean isNumber(StringBuilder number) {
        try {
            Integer.parseInt(number.toString());
            return true;
        } catch (NumberFormatException e) {
            System.err.println(e);
            return false;
        }
    }

    /**
     * uses for parsing
     *
     * @param number is a read line
     * @return int result
     */
    public int parseToInt(StringBuilder number) {
        try {
            return Integer.parseInt(number.toString());
        } catch (NumberFormatException e) {
            System.err.println(e);
            return 0;
        }
    }
}
