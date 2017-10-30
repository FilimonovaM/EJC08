package com.epam.hw3.farm.birds.configuration;

import com.epam.hw3.farm.configuration.FarmLoader;
import org.junit.Test;

public class FarmLoaderTest {

    @Test(expected = NullPointerException.class)
    public void loadTheFarmComponentsTest() throws Exception {
        FarmLoader farmLoader = new FarmLoader();
        farmLoader.loadTheFarmComponents(null, null, null);
    }
}