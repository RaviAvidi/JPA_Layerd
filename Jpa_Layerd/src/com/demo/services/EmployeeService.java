package com.demo.services;

import com.demo.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	
	Employee findByEmployeeId(int empid);
}
