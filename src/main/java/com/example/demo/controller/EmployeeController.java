package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(path="/employee/api/")
public class EmployeeController {

	EmployeeService productservice;
	
	@RequestMapping(path="get")
	public Employee getAllEmployee() {
		Employee emp=new Employee();
		emp.setDepartment("IT");
		emp.setEmail("dveer123@hotmail.com");
		emp.setEmplyeeId(46573);
		emp.setName("Dinesh Veer");
		emp.setSalary(42000);
		
		return emp;
	}
	
	
	
}
