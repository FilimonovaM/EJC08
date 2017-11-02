package com.epam.hw4;

import java.io.BufferedReader;
import java.io.IOException;

public class Reader {
    int value=0;
    StringBuffer stringBuffer=  new StringBuffer();
    BufferedReader bufferedReader;
    public Reader(BufferedReader bufferedReader){
        this.bufferedReader = bufferedReader;
    }

    public int read() throws IOException {
        stringBuffer.setLength(0);
        return value = isNum(stringBuffer.append(bufferedReader.readLine()));
    }
    public int isNum(StringBuffer stringBuffer){
        int number = -1;
        number = Integer.parseInt(stringBuffer.toString());
        return number;
    }
}
