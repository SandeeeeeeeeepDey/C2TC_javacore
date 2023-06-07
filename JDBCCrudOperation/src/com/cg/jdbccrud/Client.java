package com.cg.jdbccrud;
import java.sql.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=DBUtil.getConnection();
		if(connection!=null) {
			System.out.println("!!!!!!!!!!!!!!!!!!");
		}
		try {
			CrudOperations.showemp();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
