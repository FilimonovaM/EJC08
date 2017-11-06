package com.epam.hw4.menu.config;

import com.epam.hw4.answer.phrases.Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnswerReader {
    BufferedReader bufferedReader;
    private int bet;

    AnswerReader() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

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

    public int read(int bet) {
        this.bet = bet;
        try {
            String answer = bufferedReader.readLine();
            bet = Integer.parseInt(answer);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return bet;
    }

    public String closeReader() throws IOException {
        bufferedReader.close();
        return Answer.WELCOME.toString(2);
    }
}
