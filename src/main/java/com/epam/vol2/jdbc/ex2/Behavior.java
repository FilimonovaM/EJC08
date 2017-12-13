package com.epam.vol2.jdbc.ex2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Behavior {
    PreparedStatement doIt(Connection connection) throws SQLException;
}
