package com.epam.vol1.hw3.farm.configuration;

import com.epam.vol1.hw3.farm.configuration.FarmLoader;
import org.junit.Test;

public class FarmLoaderTest {

    @Test(expected = NullPointerException.class)
    public void loadTheFarmComponentsTest() throws Exception {
        FarmLoader farmLoader = new FarmLoader();
        farmLoader.loadTheFarmComponents(null, null, null);
    }
}