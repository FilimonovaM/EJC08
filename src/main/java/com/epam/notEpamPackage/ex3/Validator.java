package com.epam.notEpamPackage.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public boolean validate(String read, String patt) {
        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(read);
        return matcher.matches();
    }
}
