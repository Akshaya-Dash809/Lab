package com.cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {

	static {
		try {
			//register my sql driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	//build connection
	public static Connection con()throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/akshaya_db", "Akshaya","Ak@80933");
	}
}
