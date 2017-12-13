package com.epam.vol2.collections.ex2;

import java.io.File;

public class Collections {
    final String PATH = "C:" + File.separatorChar + "Users" + File.separatorChar
            + "Admin" + File.separatorChar + "Desktop" + File.separatorChar + "Work"
            + File.separatorChar + "Programmers" + File.separatorChar +
            "javacoresept" + File.separatorChar + "src" + File.separatorChar + "main"
            + File.separatorChar + "resources" + File.separatorChar +
            "logging.properties";

    /**
     * uses to starting of the PropertyReader
     */
    public static void main(String[] args) {
        UniversalPropertyReader universalPropertyReader = new UniversalPropertyReader();
        Collections collections = new Collections();
        try {
            universalPropertyReader.read(collections.PATH, "handlers");
        } catch (NullPointerException n) {
            System.err.println(n.getMessage());
        }
    }
}
