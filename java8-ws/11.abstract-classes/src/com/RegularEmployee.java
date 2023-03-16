package com;

public class RegularEmployee extends Employee {
	
	public RegularEmployee(int empId,String empName,String emType) {
		setEmpId(empId);
		setEmpName(empName);
		setEmpType(emType);
	}

	@Override
	public void computeSalary() {
		setSalary(22*1500);
	}
	

}
