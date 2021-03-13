package com.example.Emp;

public class DatabaseConnectionFactory {
    public static DatabaseConnection getDatabaseConnection() {
        return new MySQLDatabaseConnection();
    }
}
