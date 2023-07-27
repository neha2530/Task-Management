package com.task.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.task.model.Task;
import com.task.service.TaskService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tasklist")
public class TaksListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
		 
	
	
		
		TaskService service = new TaskService();
		try {
			List<Task> tasks = service.getAllTasks();
			service.printTaskIntoTable(resp.getWriter(), tasks);
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}}