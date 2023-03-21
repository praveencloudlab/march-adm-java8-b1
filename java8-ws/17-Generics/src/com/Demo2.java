package com;

public class Demo2<T> {
	
	void f1(T x) {
		System.out.println(x.getClass().getTypeName() +" : " +x);
	}
	
	 
	public static void main(String[] args) {
		
		
		Demo2 d=new Demo2();
		
		d.f1("Praveen");
		d.f1(394739);
		d.f1(74364.3434F);
		d.f1(834648L);
		
		
		
	}

}
