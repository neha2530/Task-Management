package com.task.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.task.service.TaskService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/edit-form")
public class TaskEditFormController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String id = req.getParameter("id");
	
		 
		 TaskService service = new TaskService();
		 service.printEditForm(resp.getWriter(), id);
	
//				 try {
//						//service.editTask(id, description);
//						resp.sendRedirect("tasklist");
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
			}
	}


