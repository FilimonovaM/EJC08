package com.epam.vol2.strings.interfases;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public interface Enigma {

    static final Locale RUS = new Locale("RU");
    static final Locale ENG = new Locale("eng");

    /**
     * unrealized method for asking the enigmas.
     *
     * @param locale - is an object of text localization from something "text.properties".
     */
    Locale ask(Locale locale);

    /**
     * uses for import of the text from something "text.properties".
     * default method.
     *
     * @param resourceBundle - is an object of ResourceBundle with the chosen localization.
     * @param key            - is a number of the language line in something "text.properties"
     */
    default String translate(ResourceBundle resourceBundle, String key)
            throws UnsupportedEncodingException {
        return resourceBundle.getString(key);
    }
}
