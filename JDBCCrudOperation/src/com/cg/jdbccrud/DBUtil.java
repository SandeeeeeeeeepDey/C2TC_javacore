package com.cg.jdbccrud;

import java.sql.*;

public class DBUtil {
	private static final String db_driver="com.mysql.cj.jdbc.Driver";
	private static final String db_username="root";
	private static final String db_password="admin123";
	private static final String db_url="jdbc:mysql://localhost:3306/world";
	private static Connection con;
	
	static {
		try {
			//Class.forName(db_driver);
			con= DriverManager.getConnection(db_url,db_username,db_password);
		} catch ( SQLException e) {   // catch (ClassNotFoundException| SQLException e) {
			e.printStackTrace();
		}	
	}
	public static Connection getConnection() {
		return con;
	}
	
}
