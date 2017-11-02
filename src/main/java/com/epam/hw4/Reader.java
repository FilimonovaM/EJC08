package com.epam.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    int value = -1;
    StringBuffer stringBuffer = new StringBuffer();
    BufferedReader bufferedReader;

    /**
     *
     */
    public static int read() throws IOException {
        Reader reader = new Reader();
        try {
            reader.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            reader.stringBuffer.setLength(0);
            return reader.value = reader.isNum(reader.stringBuffer.append(reader.bufferedReader.readLine()));
        } catch (IOException e) {
            System.err.println("Buffered reader is crashed: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error input data: " + e.getMessage());
        }
        return -1;
    }

    public int isNum(StringBuffer stringBuffer) throws NumberFormatException {
        int number = Integer.parseInt(stringBuffer.toString());
        return number;
    }
}
