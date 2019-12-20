package com.zsun.java.chapter6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by qzou at 2019-12-21 00:38
 *
 * @author qzou
 */
public class EnumSingleton {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        MyThread5 t2 = new MyThread5();
        MyThread5 t3 = new MyThread5();
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyObject5 {
    public enum MyEnumSingleton {
        ConnectionFactory;

        private Connection connection;

        private MyEnumSingleton() {
            try {
                System.out.println("create MyObject");
                String url = "jdbc:mysql://localhost:3306?database=xx";
                String userName = "";
                String password = "";
                String driverName = "com.mysql.Driver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, userName, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }

    public static Connection getConnection() {
        return MyEnumSingleton.ConnectionFactory.getConnection();
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject5.getConnection().hashCode());
        }
    }
}
