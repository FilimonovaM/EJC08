package com.epam.hw1;

import java.io.IOException;

/**
 * Created by Admin on 009 09.10.17.
 */
public class Cats {


    public  static void main(String[] args) throws IOException {
        CatFeeding fth = new CatFeeding(true);
        System.out.println("Enter the cat`s name");
        fth.start();
        System.out.println("\n" +
                "Cat is grateful. Bye!");
    }
}
