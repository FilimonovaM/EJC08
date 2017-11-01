package com.epam.hw4.reader;

import java.io.BufferedReader;
import java.io.IOException;

public class Reader {
    BufferedReader bufferedReader;
    private String line;
    private int choose = 0;

    public Reader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
        return;
    }

    public int read(int minBorder, int maxBorder) throws IOException, NumberFormatException, SpecialLocalException {
        line = bufferedReader.readLine();
        choose = Integer.parseInt(line);
        if(choose>minBorder&&choose<maxBorder){
            return choose;
        }else if(line.equalsIgnoreCase("EXT")){
            return -1;
        } else{
            throw new SpecialLocalException("Illegal diapason");
        }
    }
}
