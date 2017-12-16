package com.epam.vol2.jdbc.ex2;

import com.epam.vol2.jdbc.ex2.procedures.DBOptions;

public class JdbcStart {

    /**
     * used to start the app.
     */
    public static void main(String[] args) {
        JdbcStart jdbcStart = new JdbcStart();
        jdbcStart.load();
    }

    /**
     * used to load the app.
     */
    public void load() {
        DBOptions dbOptions = new DBOptions();
        System.out.println(dbOptions.createDB());
        dbOptions.addNewLine(1, "Oliver Twist", "Charles Dickens");
        dbOptions.addNewLine(2, "Adventures of Huckleberry Finn",
                "Mark Twain");
        dbOptions.addNewLine(3, "Harry Potter and the Prisoner of Azkaban",
                "Joanne Rowling");
        dbOptions.addNewLine(4, "Harry Potter and the Prisoner of Azkaban",
                "Joanne Rowling");
        dbOptions.updateInfo(4, "title", "author");
        dbOptions.showAllInfo();
        dbOptions.showByIndex(3);
        dbOptions.removeLine(4);
        dbOptions.delete();
    }
}
