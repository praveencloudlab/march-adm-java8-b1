package com;
class C1{
	
	void f1() {
		System.out.println("C1 class f1 method");
	}
	
	void f2() {
		System.out.println("C1 class f2 method");
	}
}
public class C2 extends C1{
	
	void f1() {
		System.out.println("C2 class f1 method");
	}
	
	void f3() {
		System.out.println("C2 class f3 method");
	}
	
	public static void main(String[] args) {
		
		 C1 c1Obj=new C2(); // c2 is sub class.
		 c1Obj.f1();
		 c1Obj.f2();
		// c1Obj.f3(); //invalid
		
		
		//C2 c2=new C2();
		//c2.f1();
		// never create sub class obj directly
		
	}

}
