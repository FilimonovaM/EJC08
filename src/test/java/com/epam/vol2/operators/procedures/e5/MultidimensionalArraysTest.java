package com.epam.vol2.operators.procedures.e5;

import org.junit.Assert;
import org.junit.Test;

public class MultidimensionalArraysTest {
    @Test
    public void show() throws Exception {
        MultidimensionalArrays multidimensionalArrays = new MultidimensionalArrays();
        Assert.assertEquals("1 0 0 0 1 \n" +
                "0 1 0 1 0 \n" +
                "0 0 1 0 0 \n" +
                "0 1 0 1 0 \n" +
                "1 0 0 0 1 ", multidimensionalArrays.show(5));
    }
}