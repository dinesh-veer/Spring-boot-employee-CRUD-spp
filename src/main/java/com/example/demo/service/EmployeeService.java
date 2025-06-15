package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.model.Employee;
import io.micrometer.observation.ObservationFilter;

public interface EmployeeService {

	ArrayList<Employee> getEmployee();

	void create(Employee employee);

	void removeEmployee(int employeeId);

	Optional<Employee> getEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee updatedEmployee);
}
