package com.epam.vol2.io.exercises.serialization.films;

import org.junit.Assert;
import org.junit.Test;

public class LockStockTest {
    LockStock lockStock = new LockStock();

    @Test
    public void getFilmName() throws Exception {
        Assert.assertEquals("Lock, Stock and Two Smoking Barrels, 1998",
                lockStock.getFilmName());
    }

    @Test
    public void getActors() throws Exception {
        Assert.assertEquals("^[Jj]?a?s?o?n?\\w?[Ff]lemyng$|[Dd]?e?x?t?e?r? ?[Ff]letcher|[Nn]?i?c?k? " +
                        "?[Mm]oran|[Jj]?a?s?o?n? ?[Ss]tatham|[Ss]?t?e?v?e?n? ?[Mm]ackintosh$",
                lockStock.getActors());
    }
}