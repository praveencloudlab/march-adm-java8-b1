package com;

public class ContractEmployee extends Employee {
	
	public ContractEmployee(int empId,String empName,String emType) {
		setEmpId(empId);
		setEmpName(empName);
		setEmpType(emType);
		copyRights();
		//f2(); invalid . because f2 is private
		Employee.f1(); // valid 
	}
	

	@Override
	public void computeSalary() {
		setSalary(1000*40);
		
	}
	

}
