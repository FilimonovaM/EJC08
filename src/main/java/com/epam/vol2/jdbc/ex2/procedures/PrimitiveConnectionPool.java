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

    public Connection getConnection(){
        Connection connection = null;
        try {
            do {
                if(connectionCount<6){
                    Class.forName(DB_DRIVER);
                    connection = DriverManager.getConnection
                            (DB_URL, DB_USERNAME, DB_PASSWORD);
                    return connection;
                } else {
                    wait(300);
                }
            }while (connectionCount<6);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection ERROR:\n\t"+e.getMessage() +"\n\t");
            e.printStackTrace();
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void setConnectionCount(){
        connectionCount--;
    }
}
