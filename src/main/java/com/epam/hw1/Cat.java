package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 009 09.10.17.
 */
public class Cat {

    /**
     * uses for starting of own dialog with cat
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CatFeeding catFeeding = new CatFeeding(reader);
        System.out.println("Enter the cat`s name");
        catFeeding.start();
        reader.close();
        System.out.println("\n" +
                "Cat is grateful. Bye!");
    }
}
