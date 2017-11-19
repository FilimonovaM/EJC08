package com.epam.strings.operarions;

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

    public String read(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                return bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
    }

    public void close(){
        if(bufferedReader!=null){
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int getScore() {
        return score;
    }
    public void setScore() {
        score++;
    }
}
