package com.example.Emp;

import java.sql.Connection;

public interface DatabaseConnection {
    Connection getConnection();

    void close();
}
