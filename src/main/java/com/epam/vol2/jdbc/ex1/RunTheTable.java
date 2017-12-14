package com.epam.vol2.jdbc.ex1;

import java.sql.*;

public class RunTheTable {
    public static void main(String[] args) {
        RunTheTable runTheTable = new RunTheTable();
        runTheTable.start();
    }
/**
 * uses for creating, changing, deleting table "user" which contains id & name columns
 */
    protected void start() {
        ResultSet resultSet = null;
        try {
            Class.forName("org.h2.Driver");
            try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test")) {
                PreparedStatement preparedStatement =
                        connection.prepareStatement("create table user(" +
                                "id integer primary key auto_increment, " +
                                "name varchar(100));");
                System.out.println("Table \"user\" created!");
                preparedStatement.executeUpdate();
                connection.setAutoCommit(false);
                preparedStatement =
                        connection.prepareStatement("insert into user(id,name) values(?,?)");
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, "Fedya");
                preparedStatement.addBatch();
                preparedStatement.setInt(1, 2);
                preparedStatement.setString(2, "Nikita");
                preparedStatement.addBatch();
                preparedStatement.setInt(1,3);
                preparedStatement.setString(2,"Galya");
                preparedStatement.addBatch();
                preparedStatement.executeBatch();

                preparedStatement = connection.prepareStatement("select * from user");
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
                }
                preparedStatement = connection.prepareStatement
                        ("select * from user where (name = 'Nikita')");
                rs = preparedStatement.executeQuery();
                int i = 0;
                while (rs.next()) {
                    i = rs.getInt("id");
                    System.out.println("Nickita`s id = "+i);

                }
                preparedStatement = connection.prepareStatement
                        ("update user set name='Matvey' where name = 'Nikita'");
                preparedStatement.executeUpdate();
                preparedStatement = connection.prepareStatement("SELECT * FROM USER WHERE (ID = 2)");
                rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    System.out.println("The new value of id = "+i+" is "+rs.getString("name"));
                }
                preparedStatement = connection.prepareStatement("drop table user");
                preparedStatement.executeUpdate();
                System.out.println("Table \"user\" deleted!");
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
