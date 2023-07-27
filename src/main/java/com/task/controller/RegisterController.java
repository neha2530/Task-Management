package com.task.controller;

import java.io.IOException;

import com.task.model.User;
import com.task.model.ValidationError;
import com.task.service.UserService;
import com.task.utils.Validator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ValidationError validationError = Validator.registerRequestValidator(req);
	if(!validationError.isSuccess()) {
		resp.sendRedirect("error.jsp");
	} else {
		UserService service = new UserService();
		User user  = new User();
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));
		user.setName(req.getParameter("name"));
		user.setNumber(req.getParameter("number"));
		User registeredUser = service.registerUser(user);
		resp.sendRedirect("login.jsp"); 
	}
	
	
}
}
