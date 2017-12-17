package com.epam.vol2.jdbc.ex2.procedures;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.PriorityQueue;
import java.util.Queue;


//TODO: It isn`t connect to DB. It is experimental code, so it is not done & includes bags
//SEE PRIMITIVE CONNECTION POOL, IT WORKS!
public class CustomConnectionPool {
    private static String DB_DRIVER = "org.h2.Driver";
    private static String DB_URL = "jdbc:h2:tcp://localhost:9092/nio:~/source/db/database/db;AUTO_SERVER=TRUE";
    private static String DB_USERNAME = "sa";
    private static String DB_PASSWORD = "";
    private static int connectionCount = 0;
    private static final Queue<Connection> pool = new PriorityQueue<>(6);
    static Connection connection = null;


     public void start(){
         try {
             Class.forName(DB_DRIVER);
             for (int i = 0; i < 6; i++) {
                 System.out.println(pool.add(DriverManager.getConnection
                         (DB_URL, DB_USERNAME, DB_PASSWORD)));
                 System.out.println(pool);
             }
         } catch (SQLException e) {
             System.err.println("Connection ERROR:\n\t" + e.getMessage() + "\n\t");
             e.printStackTrace();
             System.out.println();
         } catch (ClassNotFoundException e1) {
             e1.printStackTrace();
         }
     }

    public synchronized Connection getConnection() throws InterruptedException, SQLException {
        do{
            if(pool.size()>0 && pool.size()<=6){
                connectionCount = 0;
                return pool.poll();
            } else  {
                wait(100);
                connectionCount++;
            }
        }while (connectionCount<5);
        throw new SQLException("No one connection is avalible!");
    }

    public static void setPool(Connection connection) {
        pool.add(connection);
    }

    public void closeResourcesBeforeEXT(){
        pool.forEach(connection1 -> {
            try {
                connection1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }
}
