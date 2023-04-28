package com.hdfc.capstone.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.capstone.employee.entity.Employee;
import com.hdfc.capstone.employee.exception.InvalidEmployeeIdException;
import com.hdfc.capstone.employee.repo.EmployeeRepository;

@SpringBootTest
public class EmployeeTest {

	@Autowired
	EmployeeRepository repo;

	@Test
	void testEmployee() throws InvalidEmployeeIdException {

		Employee emp = repo.findByEmployeeId(1001);
		assertEquals("Chetana Bachhav", emp.getEmployeeName());

		Employee emp1 = repo.findByEmployeeId(3005);
		assertEquals(LocalDate.of(2000, 03, 05), emp1.getDateOfBirth());

	}

}
