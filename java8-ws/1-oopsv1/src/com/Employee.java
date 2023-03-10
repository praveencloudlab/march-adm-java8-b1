package com;
public class Employee {
	int id; // 4 
	String name; // ?
	double salary; // 8 bytes
	static String country="India"; // 5 bits
	final static String COUNTRY_NAME="India"; // final means const data
	final int MAX_VALUE=50;
	// final variables
	//final 
	
	/*
	 * 
	 * static data can be called / accessed directly from the same class
	 * static data can be called / accessed by its class name from same and aother classes
	 */
	
	
	void display() { // instance
		
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Country: "+country);
		System.out.println("Country Name: "+COUNTRY_NAME);

		System.out.println("-----------------------------------------");
	}
	
	public static void main(String aaa[]) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		//Employee.country="usa";
		country="us";
		//COUNTRY_NAME="japan"; // invalid statement. final data can not be changed
		
		e1.id=10;
		e1.name="Praveen";
		e1.salary=1000;
		
		//e1.country="ind"; 
		
		e2.id=20;
		e2.name="James";
		e2.salary=2000;
		
		e3.id=30;
		e3.name="Bucky";
		e3.salary=3000;
		
		e1.display(); // display is instance. can not directly called from static method 'main'
		e2.display(); 
		e3.display(); 
		
		
		
	}
	

}
