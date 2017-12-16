package com.epam.vol2.jdbc.ex2.service;

import com.epam.vol2.jdbc.ex2.dao.LibDao;
import com.epam.vol2.jdbc.ex2.entity.Lib;
import com.epam.vol2.jdbc.ex2.procedures.PrimitiveConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibService extends PrimitiveConnectionPool implements LibDao {

    Connection connection = null;

    @Override
    public String createTable() {
        connection = getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "CREATE TABLE LIB(" +
                "ID INTEGER PRIMARY KEY AUTO_INCREMENT," +
                "TITLE VARCHAR(100)," +
                "AUTHOR VARCHAR(100))";
        String answer = "CREATION ERROR!";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            answer = "Generation of table \"LIB\" completed!";
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                    setConnectionCount();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return answer;
    }

    @Override
    public void add(Lib lib) {
        connection = getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO LIB (ID, TITLE, AUTHOR) VALUES(?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, lib.getId());
            preparedStatement.setString(2, lib.getTitle());
            preparedStatement.setString(3, lib.getAuthor());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                    setConnectionCount();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<Lib> getAll() {
        connection = getConnection();
        ResultSet resultSet = null;
        List<Lib> libList = new ArrayList<>();
        Statement statement = null;
        String sql = "SELECT ID, TITLE, AUTHOR FROM LIB";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Lib lib = new Lib();
                lib.setId(resultSet.getInt("ID"));
                lib.setTitle(resultSet.getString("TITLE"));
                lib.setAuthor(resultSet.getString("AUTHOR"));
                libList.add(lib);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if ( resultSet!= null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                    setConnectionCount();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return libList;
    }

    @Override
    public Lib getById(int index) {
        connection = getConnection();
        ResultSet resultSet = null;
        Statement statement = null;
        String sql = "SELECT * FROM LIB WHERE ID="+index;
        Lib lib = new Lib();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                lib.setId(resultSet.getInt("ID"));
                lib.setTitle(resultSet.getString("TITLE"));
                lib.setAuthor(resultSet.getString("AUTHOR"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if ( resultSet!= null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                    setConnectionCount();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return lib;
    }

    @Override
    public void update(Lib lib) {
        connection = getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE LIB SET TITLE=?, AUTHOR=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lib.getTitle());
            preparedStatement.setString(2, lib.getAuthor());
            preparedStatement.setInt(3, lib.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                    setConnectionCount();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void remove(Lib lib) {
        connection = getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM LIB WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, lib.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                    setConnectionCount();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteTable() {
        connection = getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "DROP TABLE LIB";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            System.out.println("Table \"LIB\" deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                    setConnectionCount();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
