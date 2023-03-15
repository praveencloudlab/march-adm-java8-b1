package com;
class A{ // super class A is java.lang.Object
	void f1() {
		System.out.println("A class f1 method");
	}
	void f2() {
		System.out.println("A class f2 method ");
	}
}
public class B extends A {
	@Override
	void f1() { // assumes f11 is individual method of B
		super.f1(); // calls super class f1 method
		System.out.println("B class f1 method");
		
	}
	
public static void main(String[] args) {
	
	 B b=new B();
	 b.f1();
	// b.f2();
	 
	 
}
}
