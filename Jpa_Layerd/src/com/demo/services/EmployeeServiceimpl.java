package com.demo.services;

import com.demo.dao.EmployeeDao;
import com.demo.dao.Employeedaoimpl;
import com.demo.model.Employee;

public class EmployeeServiceimpl implements EmployeeService {
    //creating dao object in service
	EmployeeDao dao;
	
	public EmployeeServiceimpl() {
		dao = new Employeedaoimpl();
	}
	
	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee findByEmployeeId(int empid) {
		Employee femp = dao.getEmployeeById(empid);
		
		return femp;
	}

}
