package com.task.model;

import java.util.ArrayList;
import java.util.List;

public class ValidationError {
	
	List<String> errors = new ArrayList<>();
	boolean success;
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}

}
