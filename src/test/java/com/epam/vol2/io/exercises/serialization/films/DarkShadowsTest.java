package com.epam.vol2.io.exercises.serialization.films;

import org.junit.Assert;
import org.junit.Test;

public class DarkShadowsTest {
    DarkShadows darkShadows = new DarkShadows();
    @Test
    public void getFilmName() throws Exception {
        Assert.assertEquals("Dark Shadows, 2012",
                darkShadows.getFilmName());
    }

    @Test
    public void getActors() throws Exception {
        Assert.assertEquals("[Jj]?o?h?n?n?y?\\w?[Dd]epp|[Mm]?i?c?h?e?l?l?e?\\w?[Pp]feiffer|" +
                        "[Ee]?l?i?z?a?b?e?t?h?\\w?[Cc]?o?l?l?i?n?s?\\w?[Ss]toddard|" +
                        "[Hh]?e?l?e?n?a?\\w?[Bb]?o?n?h?a?m?\\w?[Cc]arter|" +
                        "[Ee]?v?a?\\w?[Gg]reen" ,
                darkShadows.getActors());
    }
}