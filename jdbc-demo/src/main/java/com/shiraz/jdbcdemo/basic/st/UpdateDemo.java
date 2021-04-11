package com.shiraz.jdbcdemo.basic.st;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

    public static final String SQL = "UPDATE user_tbl SET user_name='Krish', password='tt@123' WHERE id = 2";

    public static void main(String[] args) {
        try (
                Connection conn = DbUtil.getConnection();
                Statement st = conn.createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("Data Updated");
        } catch (
                SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
