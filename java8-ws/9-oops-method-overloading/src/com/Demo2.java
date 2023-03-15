package com;

public class Demo2 {
	
	void f1(int x) {
		System.out.println("Int: "+x);
	}
	void f1(short x) {
		System.out.println("short: "+x);
	}
	void f1(byte x) {
		System.out.println("byte: "+x);
	}
	void f1(long x) {
		System.out.println("long: "+x);
	}
	
	void f1(double x) {
		System.out.println("double: "+x);
	}
	void f1(float x) {
		System.out.println("float: "+x);
	}
	
	void f1(char x) {
		System.out.println("char: "+x);
	}
	void f1(boolean x) {
		System.out.println("boolean: "+x);
	}
	
	public static void main(String[] args) {
		
		Demo2 d2=new Demo2();
		
		 //d2.f1(23); //
		
		d2.f1(773.43); // double
		
		//d2.f1(100);  // int 
		//d2.f1(846684L); // long
		//d2.f1((short)100); // short
		//d2.f1((byte)100);
		//d2.f1(7334.43); // double
		//d2.f1((float)7363.43);// float
		//d2.f1(3484.323F); // float
		//d2.f1(false); // boolean
		//d2.f1('A'); // char
		//d2.f1((int)'A'); // int
		//d2.f1((char)97);
		/*
		for(int i=97;i<123;i++)
			System.out.print((char)i+" ");
		System.out.println();
		for(int i=65;i<91;i++)
			System.out.print((char)i+" ");
		*/
	}

}
