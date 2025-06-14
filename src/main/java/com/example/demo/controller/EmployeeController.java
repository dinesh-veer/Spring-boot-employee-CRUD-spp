package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import java.util.ArrayList;

@RestController
@RequestMapping(path="/employee/api/")

public class EmployeeController {

	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}

	
	@RequestMapping(path="get")
	public ArrayList<Employee> getAllEmployee() {
		return employeeService.getEmployee();
	}
	
}
