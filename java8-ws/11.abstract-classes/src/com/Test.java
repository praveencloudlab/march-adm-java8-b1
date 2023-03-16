package com;

public class Test {

	public static void main(String[] args) {
		Employee emp=new ContractEmployee(100, "Praveen", "Contract Employee");
		emp.computeSalary();
		emp.display();
		emp.copyRights();
		
		emp=new RegularEmployee(101, "Bucky Wall", "Regular Employee");
		emp.computeSalary();
		emp.display();
		emp.copyRights();

	}

}
