package com.epam.strings.enigmas;

import com.epam.strings.interfases.Enigma;
import com.epam.strings.operarions.Reader;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Third implements Enigma {
    String answer;
    ResourceBundle resourceBundle;
    Locale locale;

    /**
     * uses for asking the enigmas.
     *
     * @param locale - is an object of text localization from something "text.properties".
     * @return an object of text localization from something "text.properties".
     */
    @Override
    public Locale ask(Locale locale) {
        this.locale = locale;
        resourceBundle = ResourceBundle.getBundle("text", locale);
        try {
            while (true) {
                System.out.printf("%s%n%s%n%n%s%n",
                        translate(resourceBundle, "str01"),
                        translate(resourceBundle, "str02"),
                        translate(resourceBundle, "str31"));
                answer = Reader.getInstance().read();
                if (answer.equals("1")) {
                    locale = (locale.getLanguage().equals(ENG.getLanguage())) ? RUS : ENG;
                    resourceBundle = ResourceBundle.getBundle("text", locale);
                } else if (answer.equals("2")) {
                    System.out.printf("%n%s%n%s%n%n",
                            translate(resourceBundle, "str07"),
                            translate(resourceBundle, "str32"));
                    break;
                } else if (answer.equalsIgnoreCase(translate(resourceBundle, "str32"))) {
                    Reader.getInstance().setScore();
                    System.out.printf("%s%n",
                            translate(resourceBundle, "str06"));
                    break;
                } else {
                    System.out.printf("%s%s%n%s%s%n%n",
                            translate(resourceBundle, "str05"), answer,
                            translate(resourceBundle, "str07"),
                            translate(resourceBundle, "str32"));
                    break;
                }
            }
            System.out.printf("%s %d%n%s%n",
                    translate(resourceBundle, "str03"),
                    Reader.getInstance().getScore(),
                    translate(resourceBundle, "str04"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return locale;
    }
}
