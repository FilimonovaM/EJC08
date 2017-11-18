package com.epam.io.exercises.serialization.search;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    /**
     * uses for finding the films with a chosen actor.
     *
     * @param variants - regex with the variants of the names
     * @param actor    - name of the chosen actor
     */
    public boolean isValid(String variants, String actor) {
        Pattern pattern = Pattern.compile(variants);
        Matcher matcher = pattern.matcher(actor);
        return matcher.matches();
    }
}
