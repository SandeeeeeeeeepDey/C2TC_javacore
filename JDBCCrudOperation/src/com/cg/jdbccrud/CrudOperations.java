package com.cg.jdbccrud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class CrudOperations  {
	
	static Connection connection;
	static Statement statement;
	static {
		connection=DBUtil.getConnection();
		 try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public static void showemp() throws SQLException {
		String query="SELECT * FROM city WHERE ID<11;";
		ResultSet result=statement.executeQuery(query);
//		result.next();
		while(result.next()) {
			System.out.println( result.getString(1)+" "+result.getString(2)+" "+ result.getString(3) +" "+ result.getString(4));
		}
		
	}

}
