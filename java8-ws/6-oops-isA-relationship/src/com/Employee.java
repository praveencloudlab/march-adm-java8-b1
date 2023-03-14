package com;

public class Employee {
	
	 private int empId;
	 private String empName;
	 private double salary;
	
	private Department dept; // Employee class has dept object
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		// final calculations...
		salary=salary+2000;
		return salary;
	}

	public void setSalary(double salary) {
		// Verify user information..
		// if the user is testing, the reject it...
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + getSalary() + ", dept=" + dept + "]";
	}

	
	
	
	
	

}
