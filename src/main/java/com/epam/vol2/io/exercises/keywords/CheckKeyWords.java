package com.epam.vol2.io.exercises.keywords;

import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckKeyWords {
    int i = 1;
    LinkedHashMap<String, Integer> keyWordsMap;

    /**
     * uses for adding key words & calculating amounts of its repeats.
     */
    public void compareWords(String word, LinkedHashMap<String, Integer> keyWordsMap) {
        this.keyWordsMap = keyWordsMap;
        if (isKeyWord(word)) {
            if (keyWordsMap.containsKey(word)) {
                keyWordsMap.put(word, keyWordsMap.get(word) + 1);
            } else {
                keyWordsMap.put(word, i);
            }
        }
    }

    /**
     * uses for validation of the key words.
     */
    public boolean isKeyWord(String keyword) {
        Pattern pattern = Pattern.compile("^byte|short|int|long|char|float|double|boolean|if|else|" +
                "switch|case|default|while|do|break|continue|for|try|catch|finally|throw|throws|" +
                "private|protected|public|import|package|class|interface|extends|implements|static|" +
                "final|void|abstract|native|new|return|this|super|synchronized|volatile|const|goto|" +
                "instanceof|enum|assert|transient|strictfp$");
        Matcher matcher = pattern.matcher(keyword);
        return matcher.matches();
    }
}
