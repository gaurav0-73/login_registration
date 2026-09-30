package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/UserData",
                    "root",
                    "@GauraV0512"
            );

            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

//package com.Connection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DBConnection {
//
//    public static Connection getConnection() {
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            String url = System.getenv("DB_URL");
//            String username = System.getenv("DB_USERNAME");
//            String password = System.getenv("DB_PASSWORD");
//
//            System.out.println("DB_URL = " + url);
//            System.out.println("DB_USERNAME = " + username);
//            System.out.println("DB_PASSWORD exists = " + (password != null));
//
//            Connection con = DriverManager.getConnection(
//                    url,
//                    username,
//                    password
//            );
//
//            System.out.println("DATABASE CONNECTED SUCCESSFULLY");
//
//            return con;
//
//        } catch (Exception e) {
//
//            System.out.println("DATABASE CONNECTION FAILED");
//            e.printStackTrace();
//
//            return null;
//        }
//    }
