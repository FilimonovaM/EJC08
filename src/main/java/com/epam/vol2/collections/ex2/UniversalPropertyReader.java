package com.epam.vol2.collections.ex2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UniversalPropertyReader {
    Map<String, String> mapProperties;

    /**
     * uses for reading the any PropertyReaderFile.
     *
     * @param pathOfProperty - includes path of the property file.
     * @param key            - key for serching in the propertyFile.
     * @return - value of the key
     */
    public String read(String pathOfProperty, String key) throws NullPointerException{
        mapProperties = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        String line;
        String[] mapString = new String[2];
        File file = new File(pathOfProperty);
        if (file.exists()) {
            if (mapProperties.size() == 0) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains("=")) {
                            mapString = line.split("=");
                            mapProperties.put(mapString[0], mapString[1]);
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (!mapProperties.containsKey(key)) {
                throw new NullPointerException("Key is absence");
            }
        } else {
            throw new NullPointerException("Property file is absence");
        }
        return mapProperties.get(key);
    }
}
