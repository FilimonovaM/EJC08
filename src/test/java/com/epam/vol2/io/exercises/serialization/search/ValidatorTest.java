package com.epam.vol2.io.exercises.serialization.search;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    Validator validator = new Validator();

    @Test
    public void isValid() throws Exception {
        boolean b = validator.isValid("^[Jj]?a?s?o?n?\\w?[Ff]lemyng$|[Dd]?e?x?t?e?r? ?" +
                "[Ff]letcher|[Nn]?i?c?k? ?[Mm]oran|" +
                "[Jj]?a?s?o?n? ?[Ss]tatham|[Ss]?t?e?v?e?n? ?[Mm]ackintosh$", "Jason Flemyng");
        Assert.assertFalse(b);
    }
}