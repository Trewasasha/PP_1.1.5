package jm.task.core.jdbc.util;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Util {
    // реализуйте настройку соеденения с БД

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/mydbtest";
        String NAME = "root";
        String PASSWORD = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, NAME, PASSWORD);
    }

}
