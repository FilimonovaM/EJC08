package com.epam.vol2.operators.procedures.e4;

import org.junit.Assert;
import org.junit.Test;

public class SimpleArraysTest {
    @Test
    public void maximum() throws Exception {
        SimpleArrays simpleArrays = new SimpleArrays();
        Assert.assertEquals("Maximum sum is 17", simpleArrays.maximum(5,6,2,8,6));
    }

}