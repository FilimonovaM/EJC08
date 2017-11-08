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
     * uses for reading players answers in char format.
     *
     * @return aChar - player answer if it is correct
     * else empty symbol
     */
    public char read() {
        char aChar = ' ';
        try {
            String answer = bufferedReader.readLine();
            aChar = (answer.length() == 1 && answer.charAt(0) >= '0' && answer.charAt(0) <= '9') ?
                    answer.charAt(0) : ' ';
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aChar;
    }

    /**
     * uses for reading players answers in int format.
     *
     * @return aChar - player answer if it is correct
     * else a negative number
     */
    public int readInt() {
        int bet = -1;
        try {
            bet = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return bet;
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
