package com;

public class Demo {
	/*
	 * methods : 4 types
	 * ============
	 * 1.method without argument and without return type
	 * 2.method with argument and without return type
	 * 3.method without argument and with return type
	 * 4.method with argument and with return type
	 * 
	 *  Arguments : 2 types
	 *  ================
	 *  1.actual arguments
	 *  2.formal arguments
	 *  
	 *  1.actual arguments
	 *  ---------------------------
	 *  Arguments what we pass on to the method declaration/ method call
	 *  
	 *  2.formal arguments
	 *  ------------------------
	 *  Arguments which can store actual arguments inside
	 *  method defination or method body
	 *  
	 *  
	 *  call by value and call by reference
	 *  
	 *  Call by value
	 *  ============
	 *  Any changes made to formal arguments will not effect
	 *  on actual arguments
	 *  ex: all primitive variables
	 *  
	 *  Call by Reference
	 *  ==============
	 *  Any changes to formal arguments will reflect back on
	 *  actual arguments
	 *  ex: all java objects. 
	 *  Note: Arrays in java by default objects
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	// type 1
	  void f1() {
		  System.out.println("Hello f1");
	  }
	  
	  // type 2
	  void f2(int x) { // here x is formal argument who can store actual argument 76
		  System.out.println("X value is "+x);
	  }
	  
	  //type 3
	  int getNumber() {
		  return 100*2;
	  }
	  //type 3
	  String greetMe() {
		  return "Good Morning!";
	  }
	  
	  // type 4
	  int sum(int x,int y) {
		  return x+y;
	  }
	  
	  
	  
	
	public static void main(String[] args) {
		Demo d=new Demo();
		//d.f1();
		//d.f2(76); //here 76 is actual argument
		int res=d.getNumber();
		System.out.println("Number is "+res);
		//String msg=d.greetMe();
		//System.out.println("Greetings: "+msg);
		//System.out.println(d.greetMe());
		
		String s1 = d.greetMe(); // CTRL + SHIFT + 1 
		System.out.println(s1);
		
		int myNum = d.getNumber();
		// syso => ctrl + space
		System.out.println(myNum);
		
		int x = d.sum(100, 200);
		System.out.println(x);
		
		double r1 = Math.pow(100, 2);
		System.out.println(r1);
		double r2 = Math.sqrt(100);
		System.out.println(r2);
		
	}

}
