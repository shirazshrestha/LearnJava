package com.shiraz.jdbcdemo.basic.st;

import com.shiraz.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {

    public static final String SQL = "CREATE TABLE user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(45), primary key(id))";

    public static void main(String[] args) {

        try (
                Connection conn = DbUtil.getConnection() ;
                Statement st = conn.createStatement();
        ) {
            //4. Execute Query
            st.executeUpdate(SQL);

            System.out.println("Table Created");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
