package com.task.utils;

import java.util.ArrayList;
import java.util.List;

import com.task.model.ValidationError;

import jakarta.servlet.http.HttpServletRequest;

public class Validator { 
	
	public static ValidationError registerRequestValidator(HttpServletRequest req) {
		ValidationError error = new ValidationError();
		List<String> allErrors = new ArrayList<>();
		if(req.getParameter("password").equals(req.getParameter("repeat-password"))) {
			error.setErrors(allErrors);
			error.setSuccess(true);
		} else {
			allErrors.add("Password mismatch");
			error.setErrors(allErrors);
			error.setSuccess(false);
		}
        

		
		return error;
	}
	


}
