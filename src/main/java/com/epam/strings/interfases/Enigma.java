package com.epam.strings.interfases;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public interface Enigma {
    static final Locale RUS = new Locale("RU");
    static final Locale ENG = new Locale("eng");

    Locale ask(Locale locale);

    default String translate(ResourceBundle resourceBundle,String key)
            throws UnsupportedEncodingException {
        return new String(resourceBundle.getString(key).getBytes("ISO-8859-1"),
                "UTF-8");
    }
}
