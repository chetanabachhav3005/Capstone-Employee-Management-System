package com.hdfc.capstone.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.capstone.employee.dto.EmployeeDTO;
import com.hdfc.capstone.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	IEmployeeService service;
	@GetMapping("/getById/{employeeId}")
	public EmployeeDTO getEmployeebyId(@PathVariable long employeeId) throws Exception {
		
		return service.getEmployee(employeeId);
	}
}
