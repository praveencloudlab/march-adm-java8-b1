package com;

public class Employee {
	
	int empId;
	String empName;
	double salary;
	
	// constructor
	/*
	 * -> constructor is a special member of a class which invokes as soon as an object 
	 *       created.
	 *  -> constructor name and class name must be same
	 *  -> constructor never return anything. not even 'void' . But it can take
	 *       arguments   
	 *       
	 *  -> constructor without any arguments is called default constructor
	 *  -> constructor with arguments is called argument based constructor
	 *  -> JVM adds a default constructor when you don't provide any argument
	 *       based constructors
	 */
	
	 
	 // Employee(){  // default constructor
		//  System.out.println("Employee Object created....");
	  //}
	
	/*
	 *  4 cases: 
	 *  --------------
	 *  1.make empId is mandate while creating object of Employee
	 *    -> use one argument based constructor passing empId 
	 *         as argument
	 *  2. make either empID or empName or Salary mandate
	 *    -> use one argument based constructor for empId,empNam and salary
	 *  3. make empId and empName mandate.
	 *    -> use two argument based constructor by passing empId
	 *         and empName as arguments. Make sure, do not provide
	 *         any one argument based constructors
	 *  4. make empId,empName and salary mandate while creating
	 *         employee object.
	 *    -> use 3 argument based constructor by passing empId,
	 *         empName and salary. make sure all other constructors
	 *         must be disabled.
	 */
	  
	/*
	  //case 1
	  Employee(int empId){ // one argument based constructor
		  this.empId=empId;
		  // this operator / keyword represents current class obj
	  }
	  
	  Employee(String empName){
		  this.empName=empName;
	  }
	  
	  Employee(double salary){
		  this.salary=salary;
	  }
	  
	  
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	*/
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	static void display(Employee emp) {
		System.out.println("ID: "+emp.empId);
		System.out.println("Name: "+emp.empName);
		System.out.println("Salary: "+emp.salary);
		System.out.println("-----------------------------------");
	}

	

	

}
