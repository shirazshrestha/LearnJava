package com.shiraz.uis.util;

public class QueryUtil {
    public static final String SAVE_SQL = "INSERT INTO user_tbl(user_name, password, mobile_no, salary, dob, active) VALUES(?,?,?,?,?,?)";
    public static final String UPDATE_SQL = "UPDATE user_tbl SET user_name=?, password=?, mobile_no=?, salary=?, dob=?, active=? WHERE id=?";
    public static final String DELETE_SQL = "DELETE FROM user_tbl where id=?";
    public static final String LIST_SQL = "SELECT * FROM user_tbl";
    public static final String GET_BY_ID_SQL = "SELECT * FROM user_tbl WHERE id=?";
}
