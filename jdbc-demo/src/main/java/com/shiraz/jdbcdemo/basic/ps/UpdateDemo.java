package com.shiraz.jdbcdemo.basic.ps;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL = "UPDATE user_tbl SET user_name=?, password=? WHERE id =?";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "Krishna");
            ps.setString(2, "krishna@123");
            ps.setInt(3, 3);
            ps.executeUpdate();
            System.out.println("Data Updated");
        } catch (
                SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
