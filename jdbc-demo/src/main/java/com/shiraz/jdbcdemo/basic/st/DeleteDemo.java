package com.shiraz.jdbcdemo.basic.st;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

    public static final String SQL = "DELETE FROM user_tbl WHERE id = 2";

    public static void main(String[] args) {
        try(
                Connection conn = DbUtil.getConnection();
                Statement st = conn.createStatement();
                ){
            st.executeUpdate(SQL);
            System.out.println("Data Deleted.");
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
