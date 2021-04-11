package com.shiraz.jdbcdemo.basic.st;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

    public static final String SQL = "SELECT * FROM user_tbl";

    public static void main(String[] args) {
        try (
                Connection conn = DbUtil.getConnection();
                Statement st = conn.createStatement();
        ) {
            ResultSet rs = st.executeQuery(SQL);
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
