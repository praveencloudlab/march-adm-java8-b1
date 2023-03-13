package com;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(3847384);
		
		/*
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		*/
		//Employee.display(emp);
		
		System.out.println(emp.toString()); // toString() method of java.lang.Object

	}

}
