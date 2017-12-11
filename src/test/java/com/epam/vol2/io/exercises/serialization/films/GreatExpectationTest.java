package com.epam.vol2.io.exercises.serialization.films;

import org.junit.Assert;
import org.junit.Test;

public class GreatExpectationTest {
    GreatExpectation greatExpectation = new GreatExpectation();
    @Test
    public void getFilmName() throws Exception {
        Assert.assertEquals("Great Expectations, 2012",
                greatExpectation.getFilmName());
    }

    @Test
    public void getActors() throws Exception {
        Assert.assertEquals("^J[j]?e?r?e?m?y?\\w?I[i]rvine|" +
                        "[Hh]?o?l?l?i?d?a?y? ?[Gg]rainger|" +
                        "[Rr]?a?l?p?h?\\w?[Ff]iennes|" +
                        "[Hh]?e?l?e?n?a?\\w?[Bb]?o?n?h?a?m?[ -]?[Cc]arter|" +
                        "[Rr]?o?b?b?i?e?\\w?[Cc]oltrane|" +
                        "[Jj]?a?s?o?n?\\w?[Ff]lemyng$" ,
                greatExpectation.getActors());
    }
}