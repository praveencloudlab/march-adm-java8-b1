package com;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	
	// getters (read only)
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}
	
	// setters (modification of instance variables)
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	public static void display(Employee emp) {
		System.out.println("ID: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("----------------------------------------------");
	}
	
	

}
