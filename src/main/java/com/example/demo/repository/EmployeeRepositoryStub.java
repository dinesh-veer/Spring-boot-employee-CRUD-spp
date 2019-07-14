package com.example.demo.repository;

import java.util.ArrayList;

import com.example.demo.model.Employee;

public class EmployeeRepositoryStub implements EmployeeRepository {

	private static ArrayList<Employee> employee=new ArrayList<>();
	
	static {
		Employee emp= new Employee();
		emp.setDepartment("IT");
		emp.setEmail("dveer123@hotmail.com");
		emp.setEmplyeeId(46527);
		emp.setName("Dinesh");
		emp.setSalary(40);
		
		employee.add(emp);
		
		Employee emp1=new Employee();
		emp1.setDepartment("TEST");
		emp1.setEmail("Test123@hotmail.com");
		emp1.setEmplyeeId(675798);
		emp1.setName("Raj");
		emp1.setSalary(46);
		employee.add(emp1);
		
		
	}
	
	@Override
	public ArrayList<Employee> getAllEmployee() {
		return EmployeeRepositoryStub.employee;
	}

}
