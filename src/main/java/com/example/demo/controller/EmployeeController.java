package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import java.util.ArrayList;

@RestController
@RequestMapping(path="/api/employee")

public class EmployeeController {

	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}

	@GetMapping
	public ArrayList<Employee> getAllEmployee() {
		return employeeService.getEmployee();
	}

	@GetMapping({"/{id}"})
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping(path = "create")
	public ResponseEntity<HttpStatus> addEmployee(@RequestBody Employee employee) {
		employeeService.create(employee);
		return ResponseEntity.status(HttpStatus.CREATED.value()).build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
		Employee result = employeeService.updateEmployee(id, updatedEmployee);
		return result != null ? ResponseEntity.ok(result) : ResponseEntity.notFound().build();
	}

	@DeleteMapping(path = ":employeeId")
	public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam("employeeId") int employeeId) {
		 employeeService.removeEmployee(employeeId);
		return ResponseEntity.status(HttpStatus.ACCEPTED.value()).build();
	}
	
}
