package com;

public class Sample {
	
	void m1() { // instance method
		// wantes to access x variable from Test class
		//x=1000; // invalid
		// Test class Object needed to access x variable
	}
	
	public static void main(String[] aa) {
		//Employee.country="uk";
		System.out.println("country: "+Employee.country);
		
	}

}
