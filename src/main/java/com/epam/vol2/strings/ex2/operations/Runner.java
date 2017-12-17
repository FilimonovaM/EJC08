package com.epam.vol2.strings.ex2.operations;

import com.epam.vol2.strings.ex2.interfases.Enigma;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Runner {
    Locale currentLocale;
    List<Enigma> enigmaList = new ArrayList();

    public Runner(Enigma... enigmas) {
        for (Enigma enigma : enigmas) {
            enigmaList.add(enigma);
        }
        currentLocale = Enigma.ENG;
    }

    /**
     * uses for loading of the enigmas objects from the ArrayList.
     */
    public void run() {
        for (Enigma enigma : enigmaList) {
            currentLocale = enigma.ask(currentLocale);
        }
        Reader.getInstance().close();
    }
}
