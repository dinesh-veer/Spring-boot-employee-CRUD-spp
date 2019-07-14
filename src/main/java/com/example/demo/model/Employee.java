package com.example.demo.model;

public class Employee {

	public Employee() {
		super();
	}

	public Employee(int emplyeeId, String name, String email, int salary, String department) {
		super();
		this.emplyeeId = emplyeeId;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}

	private int emplyeeId;
	private String name;
	private String email;
	private int salary;
	private String department;

	public int getEmplyeeId() {
		return emplyeeId;
	}

	public void setEmplyeeId(int emplyeeId) {
		this.emplyeeId = emplyeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [emplyeeId=" + emplyeeId + ", name=" + name + ", email=" + email + ", salary=" + salary
				+ ", department=" + department + "]";
	}

}
