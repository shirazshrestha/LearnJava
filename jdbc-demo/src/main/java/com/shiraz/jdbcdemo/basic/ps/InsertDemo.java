package com.shiraz.jdbcdemo.basic.ps;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertDemo  {

    public static final String SQL = "INSERT INTO user_tbl(user_name,password) VALUES(?, ?)";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "Krish");
            ps.setString(2, "kr@123");
            ps.executeUpdate();
            System.out.println("Data Inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
