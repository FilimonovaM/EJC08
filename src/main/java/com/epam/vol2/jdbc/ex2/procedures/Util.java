package com.epam.vol2.jdbc.ex2.procedures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String DB_DRIVER = "org.h2.Driver";
    private static String DB_URL = "jdbc:h2:~/test1";
    private static String DB_USERNAME = "sa";
    private static String DB_PASSWORD = "";

    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection ERROR:\n\t"+e.getMessage() +"\n\t");
            e.printStackTrace();
            System.out.println();
        }
        return connection;
    }
}
