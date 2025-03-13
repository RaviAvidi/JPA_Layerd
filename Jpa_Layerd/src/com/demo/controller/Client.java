package com.demo.controller;

import com.demo.model.Employee;
import com.demo.services.EmployeeService;
import com.demo.services.EmployeeServiceimpl;

public class Client {

	public static void main(String[] args) {
		
		EmployeeService service= new EmployeeServiceimpl();
		
		//creating employee object to insert into database
		Employee emp= new Employee(783, "Ravi", 8900, "Hyderabad");
		
//		service.addEmployee(emp);
		Employee employee=service.findByEmployeeId(783);
		
//		service.findByEmployeeId(783);
		
		System.out.println(employee);
		
	}
}
