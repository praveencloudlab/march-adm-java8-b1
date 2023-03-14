package com;

public class Test {
	
	 static void test(Employee obj) {
		  // some testing code
		 // obj.salary=100;
		 obj.setSalary(100);
		  // test is done ..
	  }

	public static void main(String[] args) {
		Department d1=new Department();
		d1.setDeptId(100);
		d1.setDeptName("HR");
		
		Employee emp=new Employee();
		//emp.empId=10000;
		emp.setEmpId(10000);
		emp.setEmpName("Praveen");
		//emp.salary=15000;
		emp.setSalary(15000);
		test(emp);// test before display ...
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
