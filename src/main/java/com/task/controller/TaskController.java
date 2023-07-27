package com.task.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.task.model.Task;
import com.task.service.TaskService;
import com.task.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/createTask")
public class TaskController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
		 
	
		String title = req.getParameter("title");
		String description = req.getParameter("description");
		String dueDate = req.getParameter("dueDate");
		String prirority = req.getParameter("prirority");
		Task task = new Task();
		task.setTitle(title);
		task.setDescription(description);
		task.setDueDate(dueDate);
		task.setPrirority(prirority);
		TaskService service = new TaskService();
		service.createTask(task);
		resp.sendRedirect("tasklist");
		
	}}