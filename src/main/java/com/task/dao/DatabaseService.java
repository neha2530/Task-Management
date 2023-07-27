package com.task.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseService {
	// insert into user (email, password, name, number) values ('neha12@gmail.com' , '1234', 'neha','9568824569')
	public void executeUpdate(String sql) {
		 Statement stmt = null;
			try {
				stmt = DatabaseInitalizer.getConnection().createStatement();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  try {
			
				stmt.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public ResultSet executeQuery(String sql) {
		 Statement stmt = null;
			try {
				stmt = DatabaseInitalizer.getConnection().createStatement();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	    	  try {
			
				return stmt.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	}

}
