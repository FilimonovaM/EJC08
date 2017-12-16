package com.epam.vol2.jdbc.ex2.procedures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrimitiveConnectionPool {
    private static String DB_DRIVER = "org.h2.Driver";
    private static String DB_URL = "jdbc:h2:~/test1";
    private static String DB_USERNAME = "sa";
    private static String DB_PASSWORD = "";
    private static int connectionCount = 0;

    static {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Было интересно, можно ли запилить простой, но все же работающий,
    // механизм без многопоточной модели. Тем более официально мы ее не прошли.
    /**
     * uses for getting  connections to DB.
     * <p>
     * maximal value of pool => 6 connections.
     *
     * @return new connection or null(if timed out).
     */
    public Connection getConnection() {
        Connection connection = null;
        int count = 0;
        try {
            do {
                if (connectionCount <= 6) {
                    connection = DriverManager.getConnection
                            (DB_URL, DB_USERNAME, DB_PASSWORD);
                    return connection;
                } else {
                    wait(100);
                    count++;
                    if (count > 10) {
                        System.out.println("Timed out. Connection is not available now.");
                        return null;
                    }
                }
            } while (connectionCount < 6);
        } catch (SQLException e) {
            System.err.println("Connection ERROR:\n\t" + e.getMessage() + "\n\t");
            e.printStackTrace();
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * used to calculate active connections.
     */
    public void setConnectionCount() {
        connectionCount--;
    }
}
