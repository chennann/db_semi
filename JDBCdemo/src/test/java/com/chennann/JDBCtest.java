package com.chennann;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCtest {

    @Test
    public void TestSelect() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db_semi";
        String username = "roy";
        String password = "qwer=1234";
        Connection conn = DriverManager.getConnection(url, username, password);


        String sql = "select * from table01";

        Statement stmt = conn.createStatement();

        ResultSet resultSet = stmt.executeQuery(sql);
        //print result
        while (resultSet.next()) {
            System.out.print(resultSet.getInt("id") + "\t");
            System.out.print(resultSet.getString("username") + "\t");
            System.out.println(resultSet.getInt("age") + "\t");
        }

        stmt.close();
        conn.close();
    }

    @Test
    public void TestInsert() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db_semi";
        String username = "roy";
        String password = "qwer=1234";
        Connection conn = DriverManager.getConnection(url, username, password);


        String sql = "insert into table01 (username, age) values ('chen', 12)";

        Statement stmt = conn.createStatement();

        stmt.executeUpdate(sql);


        stmt.close();
        conn.close();
    }
}


