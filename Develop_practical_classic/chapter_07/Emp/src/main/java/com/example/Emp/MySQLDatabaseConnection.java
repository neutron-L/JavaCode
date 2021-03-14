package com.example.Emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLDatabaseConnection implements DatabaseConnection {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String DATABASE = "javaee";
    private static String URL="jdbc:mysql://localhost:3306/" + DATABASE + "?serverTimezone=GMT%2B8";
    private static String USER = "root";
    private static String PASSWORD="131125fei";

    private Connection conn = null;

    MySQLDatabaseConnection() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        return conn;
    }

    @Override
    public void close() {
        assert conn != null;
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
