package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public List<Employee> getEmployee() {
		return employeeRepository.findAll() ;
	}

	@Override
	public Employee create(Employee employee) {
		 return employeeRepository.save(employee);
	}

	@Override
	public void removeEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public Employee updateEmployee(Long id, Employee updatedEmployee) {
		return employeeRepository.findById(id).map(employee -> {
			employee.setName(updatedEmployee.getName());
			employee.setEmail(updatedEmployee.getEmail());
			employee.setDepartment(updatedEmployee.getDepartment());
			return employeeRepository.save(employee);
		}).orElse(null);
	}

}
