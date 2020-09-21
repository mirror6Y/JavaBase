package cn.mirror6.source.mybatis.demo1basis;

import cn.mirror6.source.mybatis.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: JDBC查询数据
 * @Author: mirror6
 * @Date: 2020/7/31 22:29
 */
public class Basic {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/citymis?serverTimezone=GMT%2B8&amp&useSSL=false&autoReconnect=true&failOverReadOnly=false";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        List<User> list = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(url, "root", "mirror6");
            statement = connection.createStatement();
            set = statement.executeQuery("select account,name from system_user ");
            while (set.next()) {
                String account = set.getString(1);
                String name = set.getString(2);
                list.add(new User(account, name));
            }
            System.out.println(list.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (set != null) {
                try {
                    set.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
