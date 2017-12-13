package com.epam.vol2.jdbc.ex2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public enum Saved {
    CREATE_TABLE {
        public PreparedStatement doIt(Connection connection) throws SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("create table library(id integer primary key auto_increment," +
                            "name varchar(100), author varchar(100));");
            return preparedStatement;
        }
    },
    PUT {
        public PreparedStatement doIt(Connection connection) throws SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("insert into library(id, name, author) value(?,?,?)");
            return preparedStatement;
        }
    },
    SEARCH {
        public PreparedStatement doItString(Connection connection, String obj) throws SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("select * from library where " + obj);
            return preparedStatement;
        }

        public PreparedStatement doItNum(Connection connection, int obj) throws SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("select * from library where " + obj);
            return preparedStatement;
        }
    },
    DELETE {
        public PreparedStatement doIt(Connection connection, String obj) throws SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("delete * from library where " + obj);
            return preparedStatement;
        }
    }
}