package com.epam.vol2.io.exercises.keywords;

import org.junit.Assert;
import org.junit.Test;

public class CheckKeyWordsTest {
    CheckKeyWords checkKeyWords = new CheckKeyWords();

    @Test
    public void isKeyWord() throws Exception {
        boolean b = checkKeyWords.isKeyWord("for");
        Assert.assertTrue(b);
        b = checkKeyWords.isKeyWord("forere");
        Assert.assertFalse(b);
    }
}