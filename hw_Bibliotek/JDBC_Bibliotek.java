package de.telran.practice_15_11.hw_Bibliotek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Bibliotek {
    public static void main(String[] args) {

        final String DB_URL = "jdbc:mysql://localhost:3306/libliblib";
        final String USER = "root";
        final String PASS = "chemnitz2023";

        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            // Execute a query
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO users (name, email) VALUES ('Bob', 'bob@mail.com')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO users (name, email) VALUES ('Alice', 'alice@mail.com')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO users (name, email) VALUES ('Peter', 'peter@mail.com')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO books (title, author, user_id) VALUES('Book One', 'Author A', 1)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO books (title, author, user_id) VALUES('Book Two', 'Author B', 2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO books (title, author, user_id) VALUES('Book Three', 'Author C', 3)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
