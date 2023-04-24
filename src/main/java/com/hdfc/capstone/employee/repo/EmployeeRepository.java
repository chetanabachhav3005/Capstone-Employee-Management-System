package com.hdfc.capstone.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hdfc.capstone.employee.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Transactional
	@Query("SELECT e FROM Employee e WHERE e.id = :employeeId")
	public Employee findByEmployeeId(@Param("employeeId")long employeeId);
}
