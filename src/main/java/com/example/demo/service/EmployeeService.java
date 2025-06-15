package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployee();

	Employee create(Employee employee);

	void removeEmployee(Long employeeId);

	Optional<Employee> getEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee updatedEmployee);
}
