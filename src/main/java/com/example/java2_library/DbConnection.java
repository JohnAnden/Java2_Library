package com.example.java2_library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection connect = null;

    static
    {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "password"; // skriv in ditt lösenord här.
        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return connect;
    }
}
