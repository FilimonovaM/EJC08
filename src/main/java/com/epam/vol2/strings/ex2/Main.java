package com.epam.vol2.strings.ex2;

import com.epam.vol2.strings.ex2.enigmas.First;
import com.epam.vol2.strings.ex2.enigmas.Second;
import com.epam.vol2.strings.ex2.enigmas.Third;
import com.epam.vol2.strings.ex2.operations.Runner;

import java.io.UnsupportedEncodingException;

public class Main {

    /**
     * uses for loading application.
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        Runner runner = new Runner(new First(), new Second(), new Third());
        runner.run();
    }
}
