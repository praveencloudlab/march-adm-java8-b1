package com;

class Employee{	
	int empId;
	String empName;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId) {
		this.empId = empId;
	}
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) { // here obj : emp2
		Employee emp=(Employee)obj;
		return (emp.empId==this.empId && emp.empName.equals(empName) && emp.salary==salary);
	}
	
	
}
public class HashcodeDemo {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(1500,"Praveen",15000);
		Employee emp2=new Employee(1500,"Praveen",15000);
		
		// equals method compares only content of objects
		if(emp1.equals(emp2)) { // == always compared hashcodes of objects
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
	
		System.out.println("Emp1 Hashcode: "+emp1.hashCode());
		System.out.println("Emp2 Hashcode: "+emp2.hashCode());

		System.out.println("Identity hashcode of Emp1: "+System.identityHashCode(emp1));
		System.out.println("Identity hashcode of Emp2: "+System.identityHashCode(emp2));

		//System.out.println("Identity Hashcode: "+System.identityHashCode(emp1));
		
		
		
		
	}

}
