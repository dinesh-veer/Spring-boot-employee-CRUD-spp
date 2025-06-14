package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

public interface EmployeeService {

	ArrayList<Employee> getEmployee();
}
