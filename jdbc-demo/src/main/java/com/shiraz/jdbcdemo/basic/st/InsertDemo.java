package com.shiraz.jdbcdemo.basic.st;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL = "INSERT INTO user_tbl(user_name,password) VALUES('Santosh Karna','santosh')";

    public static void main(String[] args) {
        try (
                Connection conn = DbUtil.getConnection();
                Statement st = conn.createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("Data Inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
