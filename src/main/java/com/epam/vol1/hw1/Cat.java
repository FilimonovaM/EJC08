package com.epam.vol1.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {

    /**
     * uses for starting of own dialog with cat
     *
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CatFeeding catFeeding = new CatFeeding(reader);
        catFeeding.getAnswer(7);
        catFeeding.start();
        reader.close();
        catFeeding.getAnswer(8);
    }
}
