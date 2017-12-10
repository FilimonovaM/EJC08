package com.epam.vol2.strings;

import com.epam.vol2.strings.enigmas.First;
import com.epam.vol2.strings.enigmas.Second;
import com.epam.vol2.strings.enigmas.Third;
import com.epam.vol2.strings.operations.Runner;

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
