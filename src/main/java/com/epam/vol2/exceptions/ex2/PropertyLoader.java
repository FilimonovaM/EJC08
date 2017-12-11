package com.epam.vol2.exceptions.ex2;

import java.io.File;

public class PropertyLoader {
    /**
     * uses to start the PropertyReader
     */
    public static void main(String[] args) {
        final String PATH = "C:" + File.separatorChar + "Users" + File.separatorChar
                + "Admin" + File.separatorChar + "Desktop" + File.separatorChar + "Work"
                + File.separatorChar + "Programmers" + File.separatorChar +
                "javacoresept" + File.separatorChar + "src" + File.separatorChar + "main"
                + File.separatorChar + "resources" + File.separatorChar +
                "logging.properties";
        PropertyReader propertyReader = new PropertyReader();
        try {
            System.out.println(propertyReader.read("ffff",".level"));
        } catch (NullPointerException e){
            System.err.println(e.getMessage());
        }

    }
}
