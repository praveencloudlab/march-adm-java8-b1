package com;

public class Demo {
	
	 void f1(int x) {
		 System.out.println("X: "+x);
	 }
	 void f1(float x) {
		 System.out.println("X: "+x);
	 }
	 void f1(double x) {
		 System.out.println("X: "+x);
	 }
	 void f1(long x) {
		 System.out.println("X: "+x);
	 }
	 void f1(String x) {
		 System.out.println("X: "+x);
	 }
	 
	 
	public static void main(String[] args) {
		
		
		Demo d=new Demo();
		d.f1(87753.65F);
		
		
	}

}
