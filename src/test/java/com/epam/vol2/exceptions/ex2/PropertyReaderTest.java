package com.epam.vol2.exceptions.ex2;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class PropertyReaderTest {
    PropertyReader propertyReader = new PropertyReader();
    final String PATH = "C:" + File.separatorChar + "Users" + File.separatorChar
            + "Admin" + File.separatorChar + "Desktop" + File.separatorChar + "Work"
            + File.separatorChar + "Programmers" + File.separatorChar +
            "javacoresept" + File.separatorChar + "src" + File.separatorChar + "main"
            + File.separatorChar + "resources" + File.separatorChar +
            "logging.properties";
    @Test
    public void read() throws Exception {
        Assert.assertEquals("FINE", propertyReader.read(PATH, ".level"));
    }
    @Test(expected = NullPointerException.class)
    public void read1() throws Exception {
        propertyReader.read("", ".level");
    }
    @Test(expected = NullPointerException.class)
    public void read2() throws Exception {
        propertyReader.read(PATH, "");
    }
    @Test(expected = NullPointerException.class)
    public void read3() throws Exception {
        propertyReader.read(null, null);
    }
}