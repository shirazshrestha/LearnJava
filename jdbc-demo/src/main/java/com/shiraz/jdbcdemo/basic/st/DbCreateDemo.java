package com.shiraz.jdbcdemo.basic.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCreateDemo {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static final String SQL = "create database jdbc_demo_db";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            //1. Register the driver
            Class.forName(DRIVER_NAME);

            //2. Obtain Connection Object
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            //3. Obtain Statement Object
            st = conn.createStatement();

            //4. Execute Query
            st.executeUpdate(SQL);
            System.out.println("DB Creation Successfull");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                //5. Close the Connection
                conn.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
