package org.kniit.lab11.task25.demo.src.main.java.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:src\\main\\java\\org\\kniit\\lab11\\task25\\files.db";
    //private static final String USER = "your_user";
    //private static final String PASSWORD = "your_password";
    private static Connection connection;

    //private DatabaseConnection() {}

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL);
        }
        return connection;
    }    
}
