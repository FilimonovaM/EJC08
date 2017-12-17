package com.epam.vol2.strings.ex2.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    BufferedReader bufferedReader;
    private int score = 0;
    private static Reader ourInstance = new Reader();

    public static Reader getInstance() {
        return ourInstance;
    }

    private Reader() {

    }

    /**
     * uses for reading the answers.
     *
     * @return String answer.
     */
    public String read() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * uses for closing the BufferedReader.
     */
    public void close() {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * uses for getting the score.
     *
     * @return score.
     */
    public int getScore() {
        return score;
    }

    /**
     * uses for setting the score.
     */
    public void setScore() {
        score++;
    }
}
