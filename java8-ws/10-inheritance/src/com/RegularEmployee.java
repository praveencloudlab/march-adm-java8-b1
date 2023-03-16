package com;

public class RegularEmployee extends Employee{
	
	@Override
	public void computeSalary() {
		System.out.println("settting up salary for RegularEmployee");
		this.setEmpName("Bucky Wall");
		this.setEmployeeType("Regular Employee");
		this.setSalary(22*3000);
	}

}
