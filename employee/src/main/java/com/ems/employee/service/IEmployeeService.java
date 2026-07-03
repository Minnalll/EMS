package com.ems.employee.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ems.employee.dto.EmployeeRequestDto;
import com.ems.employee.model.Employee;

public interface IEmployeeService {
	
	Employee createEmployee (EmployeeRequestDto emplReq);
	
	List<Employee> getEmployees();
	
	Employee getEmployees(Long eid);
	
	Employee updateEmployee (Long eid, Employee empl);
	
	void deleteEmployee(Long id);
	
	List<Employee> searchEmployees (String firstName, String lastName, LocalDate joiningStartDate, LocalDate joiningEndDate);

}
