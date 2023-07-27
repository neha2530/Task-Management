package com.task.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseInitalizer {

private static Connection connection;
	 
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connection == null) {
			 Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/taskmanagement","root","Koh-neh@12");  

			connection = con;
		}
		return connection;
				
		
	}
}
