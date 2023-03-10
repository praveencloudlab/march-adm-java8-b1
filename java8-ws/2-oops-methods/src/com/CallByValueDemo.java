package com;

public class CallByValueDemo {
	
	static void f1(int x) { // x is formal argument
		x=x+100;
		System.out.println("inside f1 :: x value is "+x);
	}
	
	public static void main(String[] args) {
		
		int num=1000;
		System.out.println("Before metho :: num :: "+num);
		f1(num); // num is actual argument
		System.out.println("After f1 method ::  num :: "+num);
		
	}

}
