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
     void testEmployee() throws InvalidEmployeeIdException{
	
//		   Employee employee1=repo.findByEmployeeId(1111);
//		    Employee employee2=repo.findByEmployeeId(56);
//		    LocalDate date=LocalDate.of(1993, 05, 01);
//		    assertEquals("Priya Arora",employee1.getEmployeeName());
//		    assertEquals(date,employee1.getDateOfBirth());
//		    assertEquals(null,employee2);
//		    
//		     
//		    
		    
		    
		    
		    Employee emp=repo.findByEmployeeId(101);
		    assertEquals("chetu",emp.getEmployeeName());
		    
		    
		    
		}

	}

