package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
    StringBuilder stringBuilder;
    BufferedReader reader;
    Operations(BufferedReader reader){
        this.reader = reader;
    }
/**
 * uses for reading
* @return read line
* */
    public StringBuilder read() throws IOException {
        stringBuilder = new StringBuilder();
        try {
            stringBuilder.setLength(0);
            return  stringBuilder.append(reader.readLine());
        } catch (IOException e) {
            System.err.println(e);
            return stringBuilder;
        }
    }

    /**
     * uses for understanding is the line a number or not
     * @return boolean answer
     * @param number is a read line
     * */
    public boolean isNumber(StringBuilder number){
        try {
            Integer.parseInt(number.toString());
            return true;
        }catch (NumberFormatException e) {
            System.err.println(e);
            return false;
        }
    }

    /**
     * uses for parsing
     * @return int result
     * @param number is a read line
     * */
    public int parseToInt(StringBuilder number){
        try {
            return Integer.parseInt(number.toString());
        } catch (NumberFormatException e){
            System.err.println(e);
            return 0;
        }
    }
}
