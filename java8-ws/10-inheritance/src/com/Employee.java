package com;

public class Employee {

	private String empName;
	private String employeeType;

	private double salary;

	public void computeSalary() {
		System.out.println("Salary: " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	public void display() {
		System.out.println("Name: "+empName);
		System.out.println("Employee Type: "+employeeType);
		System.out.println("Salary: "+salary);
		System.out.println("-------------------------------------------------");
	}
	
	
	

}
