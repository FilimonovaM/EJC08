package com.epam.vol1.cw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendar {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            Reader reader = new Reader();
            reader.read(bufferedReader);
        } catch (IOException e) {
            System.err.println("Oops! Anything gone wrong...");
        }
    }
}
