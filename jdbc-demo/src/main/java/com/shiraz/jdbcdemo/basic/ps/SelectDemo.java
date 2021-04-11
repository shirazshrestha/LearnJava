package com.shiraz.jdbcdemo.basic.ps;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.*;

public class SelectDemo {
    public static final String SQL = "SELECT * FROM user_tbl";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL)
        ) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("==================");
                System.out.println("Id is: " + rs.getInt("id"));
                System.out.println("Name is: " + rs.getString("user_name"));
                System.out.println("Password is: " + rs.getString("password"));
                System.out.println("==================");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
