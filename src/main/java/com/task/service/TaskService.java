package com.task.service;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.task.dao.DatabaseService;
import com.task.model.Task;

public class TaskService {
	
	
	public Task createTask(Task task) {
		String sql = String.format("insert into task (title, description, due_date, priority) values ('%s' , '%s', '%s','%s')",
				task.getTitle(), task.getDescription(), task.getDueDate(), task.getPrirority());
		DatabaseService databaseService = new DatabaseService();
		databaseService.executeUpdate(sql);
		return task;
	}
	
	
	public List<Task> getAllTasks() throws SQLException {
		String sql = String.format("select * from task");
		DatabaseService databaseService = new DatabaseService();
		ResultSet result = databaseService.executeQuery(sql);
		List<Task> tasks= new ArrayList<Task>();
		while(result.next()) {
			Task task = new Task();
			task.setTitle(result.getString("title"));
			task.setDescription(result.getString("description"));
			task.setDueDate(result.getString("due_date"));
			task.setPrirority(result.getString("priority"));
			task.setId(result.getString("id"));
			tasks.add(task);
			
		}
		return tasks;
	}
	
	public void deleteTask(String id) throws SQLException {
		String sql = String.format("delete  from task Where id = '%s'", id);
		DatabaseService databaseService = new DatabaseService();
		databaseService.executeUpdate(sql);
	}
	
	
	public void printTaskIntoTable(PrintWriter pw, List<Task> tasks) {
		 pw.println("<html>");
	        pw.println("<head>");
	        pw.println("<title></title>");
	        pw.println("</head>");
	        pw.println("<body style =\"background: url(img/tablbook.jpg); background-size:cover; background-attachment:fixed background-color;\">");
	       
	        pw.println("</body>");
	        pw.println("</html>");
              
	        pw.println("<div class=\"input-group\">");
	        pw.println(" <input type=\"search\" class=\"form-control rounded\" placeholder=\"Search\" aria-label=\"Search\" aria-describedby=\"search-addon\" />");
	        pw.println("  <span class=\"input-group-text border-0\" id=\"search-addon\">");
	        pw.println("   <button type=\"button\" class=\"btn btn-outline-primary\">search</button>");
	        
	        		
	        pw.println("</div>");
		     
	        pw.println("<br>");
		     
	        
	        
	        
	         pw.write("<table style='border-collapse: collapse; border: 1px solid black; background-color:#a1887f brown lighten-2; font-family;Arial;margin:0; auto; '>");
			 
			 pw.write("<tr style='background-color: #f2f2f2;'>");
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Id");
			 pw.write("</th>");
			
			 
			
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Title");
			 pw.write("</th>");
			
			 
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Description");
			 pw.write("</th>");
			 
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Due Date");
			 pw.write("</th>");
			 
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Priority");
			 pw.write("</th>");
			
			 
			 pw.write("<th style='border: 1px solid black; padding: 8px;'>");
			 pw.write("Actions");
			 pw.write("</th>");
			 
			 pw.write("</tr>");
	      
	      
	    	  tasks.forEach((task) -> {
	    		  pw.write("<tr>");
					 
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
					 pw.write(task.getId());
					 pw.write("</td>");
					
					 
					
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
					 pw.write(task.getTitle());
					 pw.write("</td>");
					
					 
				
				
					 
					
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
					 pw.write(task.getDescription());
					 pw.write("</td>");
					
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
					 pw.write(task.getDueDate());
					 pw.write("</td>");
					 
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
					 pw.write(task.getPrirority());
					 pw.write("</td>");
					
					 
					 pw.write("<td style='border: 1px solid black; padding: 8px;'>");
				
					 pw.write(String.format("<a href = '%s' style='border: 1px solid black; padding: 8px;'>", "delete?id="+task.getId()));
					 pw.write("Remove");
					 pw.write("</a>");
					
					
					 
					
				     pw.write(String.format("<a href = '%s' style='border: 1px solid black; padding: 8px;'>",
				    		 "edit.jsp?id="+task.getId()+"&description="+task.getDescription()+"&title="+task.getTitle()));
					 pw.write("Edit");
					 pw.write("</a>");
					 
					 
					 
				//	 pw.write(String.format("<a href = '%s' style='border: 1px solid black; padding: 8px;'>", "user-list?bookId="+rs.getString("id")));
					 pw.write("Issue");
					 pw.write("</a>");
					 pw.write("</td>");
					 
					 pw.write("</tr>");
	    	  });
	    	  
	    	  
	
	      pw.write("</table>");
	}
	public void editTask(String id , String description, String title ) throws SQLException {
		String sql = String.format("UPDATE task SET description = '%s' WHERE id = '%s' ", description,  id);
		String sql2 = String.format("UPDATE task SET title = '%s' WHERE id = '%s' ", title,  id);
		DatabaseService databaseService = new DatabaseService();
		databaseService.executeUpdate(sql);
		databaseService.executeUpdate(sql2);
	}


	public void printEditForm(PrintWriter pw,String id) {
		 pw.println("<html>");
	        pw.println("<head>");
	        pw.println("<title></title>");
	        pw.println("</head>");
	        pw.println("<body style =\"background: url(img/tablbook.jpg); background-size:cover; background-attachment:fixed background-color;\">");
	       
	        pw.println("</body>");
	        pw.println("</html>");

		pw.write(String.format("<form action = \"edit?id=%s\">" , id));
		pw.write("<label for=\"title\"> <b>Title</b>");
		pw.write("</label> <input type=\"text\" placeholder=\"Enter title\" name=\"title\"");
		pw.write("	id=\"title\" required> <br> <label for=\"description\">");
		pw.write("	<b>Description</b>");
		pw.write("	</label> <input type=\"text\" placeholder=\"Enter description\"");
		pw.write("			name=\"description\" id=\"description\" required> <br>");
		pw.write("<div class=\"row\">");
		pw.write("<div class=\"col s12 m6 offset-m3 center-align\">");
		pw.write("	<div class=\"col s12 m6 offset-m3 center-align\">");
		pw.write("<button type=\"submit\" class=\"btn #03a9f4 light-blue z-depth-3\">done</button>");
		pw.write("</div>");
		pw.write("</form>");
		
		
	}
}

