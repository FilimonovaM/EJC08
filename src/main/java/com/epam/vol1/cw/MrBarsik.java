package com.epam.vol1.cw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MrBarsik {
    BufferedReader reader;

    public static void main(String[] args) throws IOException {
        MrBarsik mrBarsick = new MrBarsik();
        mrBarsick.reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name: ");
        Reader reader = new Reader();
        reader.read(mrBarsick.reader);
        mrBarsick.reader.close();
    }
}
