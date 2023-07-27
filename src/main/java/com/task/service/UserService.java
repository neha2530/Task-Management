package com.task.service;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.task.dao.DatabaseInitalizer;
import com.task.dao.DatabaseService;
import com.task.model.Task;
import com.task.model.User;

public class UserService {

	public User registerUser(User user) {
		String sql = String.format("insert into user (email, password, name, number) values ('%s' , '%s', '%s','%s')",
				user.getEmail(), user.getPassword(), user.getName(), user.getNumber());
		DatabaseService databaseService = new DatabaseService();
		databaseService.executeUpdate(sql);
		return user;

	}
     


	public boolean loggedIn(String email, String password) throws SQLException {
		String sql = String.format("select * from user Where email ='%s' AND password = '%s'", email, password);
		DatabaseService databaseService = new DatabaseService();
		ResultSet resultSet = databaseService.executeQuery(sql);
		if( resultSet == null) return false;
		if(resultSet.next()) return true;
		else return false;
	}



	public User getUserByEmail( String email) throws SQLException {
		String sql = String.format("select name , number, email from user Where email = 'kohlineha625@gmail.com'");
		DatabaseService databaseService =new DatabaseService();
		ResultSet resultSet = databaseService.executeQuery(sql);
		User user= new User();
	 
		if(resultSet.next()) {
			try {
				resultSet.getString("email");
				user.setEmail(resultSet.getString("email"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				user.setName(resultSet.getString("name"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				user.setNumber(resultSet.getString("number"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			
			return user;
		
		
	
	 }



	
	



	public void printUser(PrintWriter pw,User user) {
		// TODO Auto-generated method stub
		 pw.println("<html>");
	        pw.println("<head>");
	        pw.println("<title></title>");
	        pw.println("</head>");
	        pw.println("<body style =\"background: url(img/task.png); background-size:cover; background-attachment:fixed background-color;\">");
	       
	        pw.println("</body>");
	        pw.println("</html>");
          
	        
	         pw.write("<table style='border-collapse: collapse; border: 1px solid black; background-color:#a1887f brown lighten-2; font-family;Arial;margin:0; auto; '>");
			 
			 pw.write("<tr style='background-color: #f2f2f2;'>");
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Name");
			 pw.write("</th>");
			
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Email");
			 pw.write("</th>");
			
			 
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Number");
			 pw.write("</th>");
			 
			 pw.write("</tr>");
	      
	      
	    	
	    		  pw.write("<tr>");
					 
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
					 pw.write(user.getName());
					 pw.write("</td>");
					
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
					 pw.write(user.getEmail());
					 pw.write("</td>");
					
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
					 pw.write(user.getNumber());
					 pw.write("</td>");
					
					 pw.write("</tr>");
					   pw.write("</table>");
	    	  }
	    	  
	    	  
	
	     
	}
	

	
