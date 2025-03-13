package com.demo.dao;

import javax.persistence.EntityManager;

import com.demo.model.Employee;

public class Employeedaoimpl implements EmployeeDao {
	
	//creating entity object to get info from the database
	EntityManager entity;

	public Employeedaoimpl() {
		 entity = JAPUtil.getEntityManager();
	}
	@Override
	public Employee getEmployeeById(int empid) {
		Employee getEmp=entity.find(Employee.class, empid);
		return getEmp;
	}

	@Override
	public void addEmployee(Employee emp) {
		entity.persist(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		entity.merge(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		entity.remove(emp);
		
	}

	@Override
	public void beginTransaction() {
		entity.getTransaction().begin();		
	}

	@Override
	public void commitTransaction() {
		entity.getTransaction().commit();
		
	}

}
