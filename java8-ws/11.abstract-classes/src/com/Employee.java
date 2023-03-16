package com;

public abstract class Employee {
	private int empId;
	private String empName;
	private String empType;
	private double salary;
	
	
	public final void copyRights() { // must be called/invoked by objects
		System.out.println("All rights Reserverd :: Employee class");
	}
	
	public static void f1() {} // must be invoked by class name
	private void f2() {} // not available to any other class expect Employee class
	
	public abstract void computeSalary();
	
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

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void display() {
		System.out.println("Employee ID:: "+getEmpId());
		System.out.println("Name:: "+getEmpName());
		System.out.println("Emp Type:: "+getEmpType());
		System.out.println("Salary:: "+getSalary());
		System.out.println("-----------------------------------------");
		
	}

	

}
