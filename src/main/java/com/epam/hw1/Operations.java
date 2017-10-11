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
* @return readed line
* */
    public StringBuilder read() throws IOException {
        stringBuilder = new StringBuilder();
        try {
            stringBuilder.setLength(0);

            return  stringBuilder.append(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return stringBuilder;
        }
    }

    /**
     * uses for understanding is the line a number or not
     * @return boolean answer
     * @param num is a readed line
     * */
    public boolean isNum(StringBuilder num){
        try {
            Long.parseLong(num.toString());
            return true;
        }catch (NumberFormatException e) {
            System.err.print(e);
            return false;
        }
    }

    /**
     * uses for parsing
     * @return int result
     * @param num is a readed line
     * */
    public int parseToInt(StringBuilder num){
        try {
            return Integer.parseInt(num.toString());
        } catch (NumberFormatException e){
            System.err.print(e);
            return 0;
        }
    }
}
