package com.epam.notEpamPackage.ex3;

import java.io.File;

public class Main {
    char delimiter = File.separatorChar;
    final String PATH = "." + delimiter + "src" + delimiter + "main" + delimiter +
            "resources" + delimiter + "data1.html";

    public static void main(String[] args) {
        HTMLReader htmlReader = new HTMLReader();
        Main main = new Main();
        htmlReader.read(main.PATH);
    }
}
