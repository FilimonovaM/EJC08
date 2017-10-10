package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 010 10.10.17.
 */
public class Operations {

    public StringBuilder read() throws IOException {
        StringBuilder sb = new StringBuilder();
        try{
            sb.setLength(0);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return  sb.append(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return sb;
        }
    }

    public boolean isnum(StringBuilder num){
        try{
            Long.parseLong(num.toString());
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public int parseToInt(StringBuilder num){
        try{
            return Integer.parseInt(num.toString());
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
