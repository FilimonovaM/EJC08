package com.epam.cw;

import java.io.BufferedReader;
import java.io.IOException;

public class Reader {

    void read(BufferedReader reader) {
        try {
            System.out.println("Cat`s name is " + thrower(reader.readLine()));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }

    String thrower(String name) {
        if (name.equalsIgnoreCase("Barsik")) {
            return "Barsik";
        }
        throw new ArrayIndexOutOfBoundsException("You enter the wrong name! " + name);
    }
}
