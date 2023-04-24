package com.hdfc.capstone.employee.dto;

import java.time.LocalDate;

public class EmployeeDTO {
	
	private long employeeId;
	private String employeeName;
	private byte[] dateOfBirth;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(long employeeId, String employeeName, byte[] dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public byte[] getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(byte[] dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}

