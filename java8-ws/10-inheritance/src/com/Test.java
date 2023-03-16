package com;

public class Test {

	public static void main(String[] args) {
		Employee emp=new ContractEmployee();
	
		emp.computeSalary();
		emp.display();
		emp=new RegularEmployee();
		emp.computeSalary();
		emp.display();
		
		

	}

}
