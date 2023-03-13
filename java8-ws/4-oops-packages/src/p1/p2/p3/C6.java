package p1.p2.p3;

import p1.C1;

public class C6 extends C1 { // here C6 is sub class of C1
	
	public static void main(String[] args) {
		C1 c1=new C1(); // c1 is not sub class object
		c1.f1(); // valid
		//c1.f2(); // invalid
		//c1.f3(); // invalid
		
		C6 c6=new C6(); // c6 is sub class object of C1 class
		c6.f3(); // valid
		//c6.f2(); // invalid
		c6.f1(); // valid
		
		
		
	}

}
