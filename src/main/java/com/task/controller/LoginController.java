package com.task.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.model.User;
import com.task.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
		 
	
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		UserService service = new UserService(); 
		try {
			boolean isUserLoggedIn = service.loggedIn(email, password);
			if(isUserLoggedIn) resp.sendRedirect("taskdashboard.jsp");
			else resp.sendRedirect("error.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}

