package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;
	
	@Override
	public ArrayList<Employee> getEmployee() {
		
		return employeeRepository.getAllEmployee() ;
	}

}
