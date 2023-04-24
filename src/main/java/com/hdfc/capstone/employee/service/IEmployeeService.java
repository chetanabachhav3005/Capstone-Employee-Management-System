package com.hdfc.capstone.employee.service;

import org.springframework.stereotype.Service;

import com.hdfc.capstone.employee.dto.EmployeeDTO;
import com.hdfc.capstone.employee.exception.InvalidEmployeeIdException;

@Service
public interface IEmployeeService {

	public EmployeeDTO getEmployee(long employeeId) throws InvalidEmployeeIdException, Exception ;

}
