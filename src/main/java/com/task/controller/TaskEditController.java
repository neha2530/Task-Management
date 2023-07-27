package com.task.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.task.service.TaskService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class TaskEditController  extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String id = req.getParameter("id");
	String description= req.getParameter("description");
	String title= req.getParameter("title");
	
	 TaskService service = new TaskService();
	 try {
		service.editTask(id, description, title);
		resp.sendRedirect("tasklist");
	 } catch (SQLException e) {
			
			e.printStackTrace();
	}

}
	}

