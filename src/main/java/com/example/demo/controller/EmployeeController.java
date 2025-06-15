package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping(path = "create")
	public ResponseEntity<HttpStatus> addEmployee(@RequestBody Employee employee) {
		employeeService.create(employee);
		return ResponseEntity.status(HttpStatus.CREATED.value()).build();
	}

	
	@GetMapping(path="get")
	public ArrayList<Employee> getAllEmployee() {
		return employeeService.getEmployee();
	}
	
}
