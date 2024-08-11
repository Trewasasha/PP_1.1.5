package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
//    private final Connection connection = Util.getConnection();

    public UserDaoJDBCImpl() throws SQLException, ClassNotFoundException {

    }

    public void createUsersTable() throws SQLException {

    }

    public void dropUsersTable() throws SQLException {

    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {

    }

    public void removeUserById(long id) throws SQLException {

    }

    public List<User> getAllUsers() throws SQLException {
        return null;
    }

    public void cleanUsersTable() {

    }
}
