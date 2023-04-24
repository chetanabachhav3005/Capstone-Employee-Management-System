package com.hdfc.capstone.employee.exception;

public class InvalidEmployeeIdException extends Exception{

	@Override
	public String getMessage() {
		return "Invalid Employee ID";
	}
}
