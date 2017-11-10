package com.epam.hw4.menu.configuration;

import com.epam.hw4.answer.phrases.Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnswerReader {
    BufferedReader bufferedReader;

    AnswerReader() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * uses for reading players answers in int format.
     *
     * @return aChar - player answer if it is correct
     * else a negative number
     */
    public int readInt() throws IOException, NumberFormatException {
        return Integer.parseInt(bufferedReader.readLine());
    }

    /**
     * uses for closing an InputStreamReader.
     *
     * @return a phrase which saying bye to the player
     */
    public String closeReader() throws IOException {
        bufferedReader.close();
        return Answer.WELCOME.toString(2);
    }
}
