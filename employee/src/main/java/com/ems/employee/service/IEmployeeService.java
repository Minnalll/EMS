package com.ems.employee.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ems.employee.dto.EmployeeRequestDto;
import com.ems.employee.model.Employee;

public interface IEmployeeService {
	
	public Employee createEmployee (EmployeeRequestDto emplReq);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployees(Long eid);
	
	public Employee updateEmployee (Long eid, Employee empl);
	
	public void deleteEmployee(Long id);

}
