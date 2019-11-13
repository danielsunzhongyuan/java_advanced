package com.zsun.java.quartz.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created at 2019/10/31
 *
 * @author : zsun
 */
public class SqliteConnection {
    private SqliteConnection() {
    }

    public static Connection getConnection() {
        Connection c = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Open database successfully");
        return c;
    }
}
