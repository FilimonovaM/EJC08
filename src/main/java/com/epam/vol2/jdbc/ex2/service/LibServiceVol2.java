package com.epam.vol2.jdbc.ex2.service;

import com.epam.vol2.jdbc.ex2.dao.LibDao;
import com.epam.vol2.jdbc.ex2.entity.Lib;
import com.epam.vol2.jdbc.ex2.procedures.CustomConnectionPool;
import com.epam.vol2.jdbc.ex2.procedures.PrimitiveConnectionPool;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//TODO: It isn`t connect to DB. It is experimental code, so it is not done & includes bags
//SEE LIB SERVICE, IT WORKS!
public class LibServiceVol2 extends CustomConnectionPool implements LibDao {

    Connection connection = null;

    /**
     * used for creating a new table in DB.
     *
     * @return message about a status of generation.
     */
    @Override
    public String createTable() {
        start();
        try {
            connection = getConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
                setPool(connection);
            }
        }
        return answer;
    }

    /**
     * used for adding a new line to DB.
     *
     * @param lib - exemplar of the entity Lib
     */
    @Override
    public void add(Lib lib) {
        try {
            connection = getConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
                setPool(connection);
            }
        }
    }

    /**
     * used to show the list of DB lines.
     *
     * @return List of exemplars of entity Lib.
     */
    @Override
    public List<Lib> getAll() {
        try {
            connection = getConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
            if (resultSet != null) {
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
                setPool(connection);
            }
        }
        return libList;
    }

    /**
     * uses to find & show line by its id.
     *
     * @param index - the index of line that we need.
     * @return lib - exemplar of the entity Lib.
     */
    @Override
    public Lib getById(int index) {
        try {
            connection = getConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        Statement statement = null;
        String sql = "SELECT * FROM LIB WHERE ID=" + index;
        Lib lib = new Lib();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                lib.setId(resultSet.getInt("ID"));
                lib.setTitle(resultSet.getString("TITLE"));
                lib.setAuthor(resultSet.getString("AUTHOR"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
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
                setPool(connection);
            }
        }
        return lib;
    }

    /**
     * used to update line by its id.
     *
     * @param lib - exemplar of the entity Lib contains the new
     *            value of columns TITLE & AUTHOR in DB.
     * @return lib - exemplar of the entity Lib.
     */
    @Override
    public void update(Lib lib) {
        try {
            connection = getConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
                setPool(connection);
            }
        }
    }

    /**
     * used to remove line by its id.
     *
     * @param lib - exemplar of the entity Lib with info about the line for deleting.
     */
    @Override
    public void remove(Lib lib) {
        try {
            connection = getConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
                setPool(connection);
            }
        }
    }

    /**
     * used to delete table "LIB".
     */

    @Override
    public void deleteTable() {
        try {
            connection = getConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
                setPool(connection);
            }
            closeResourcesBeforeEXT();
        }
    }
}
