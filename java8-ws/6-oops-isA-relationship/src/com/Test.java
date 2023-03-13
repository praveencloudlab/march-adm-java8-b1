package com;

public class Test {

	public static void main(String[] args) {
		Department d1=new Department();
		d1.setDeptId(100);
		d1.setDeptName("HR");
		
		Employee emp=new Employee();
		emp.setEmpId(10000);
		emp.setEmpName("Praveen");
		emp.setSalary(485);
		emp.setDept(d1);
		
		/*
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
		System.out.println(emp.getDept().getDeptId());
		System.out.println(emp.getDept().getDeptName());
		*/
		System.out.println(emp);

	
	}

}
