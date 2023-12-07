package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Siroj12@";
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/os-project";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}
