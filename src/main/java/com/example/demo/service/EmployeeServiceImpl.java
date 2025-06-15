package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import io.micrometer.observation.ObservationFilter;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public ArrayList<Employee> getEmployee() {
		
		return employeeRepository.getAllEmployee() ;
	}

	@Override
	public void create(Employee employee) {
		 employeeRepository.create(employee);
		 return;
	}

	@Override
	public void removeEmployee(int employeeId) {
		employeeRepository.removeEmployee(employeeId);
		return;
	}

	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return Optional.of(null);
	}

	@Override
	public Employee updateEmployee(Long id, Employee updatedEmployee) {
		return null;
	}

}
