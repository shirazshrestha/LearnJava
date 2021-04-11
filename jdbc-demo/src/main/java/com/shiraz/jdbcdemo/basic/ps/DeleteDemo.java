package com.shiraz.jdbcdemo.basic.ps;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
    public static final String SQL = "DELETE FROM user_tbl WHERE id = ?";

    public static void main(String[] args) {
        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){
            ps.setInt(1,3);
            ps.executeUpdate();
            System.out.println("Data Deleted.");
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
