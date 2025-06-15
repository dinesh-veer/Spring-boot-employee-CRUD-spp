package com.example.demo.repository;

import java.util.ArrayList;

import com.example.demo.model.Employee;

public interface EmployeeRepository {

	ArrayList<Employee> getAllEmployee();

	void create(Employee employee);

	void removeEmployee(int employeeId);
}
