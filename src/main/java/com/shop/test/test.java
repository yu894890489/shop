package com.shop.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8","root","199292");
		System.out.println(conn);
	}
}
