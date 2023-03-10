package com;

   class Sample{
	   int sampleId;
	   
	   static void callByRefDemo(Sample obj) { // obj is formal argument
		   obj.sampleId=2000;
		   System.out.println("inside callByRefDemo :: sampleId :: "+obj.sampleId);
	   }
	   
	   // arrays also by default call by reference
	   static void f1(int x[]) { // x is formal argument
		   x[0]=100;
		   System.out.println("inside f1 method ::x[0] :: "+x[0]);
	   }
	   
   }

public class CallByReferenceDemo {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.sampleId=1000;
		System.out.println("Before method :: sampleId :: "+s.sampleId);
		Sample.callByRefDemo(s); // s is actual argument
		System.out.println("After method :: sampleId :: "+s.sampleId);
		
		System.out.println("------------------------");
		int x[]=new int[1];
		x[0]=5000;
		System.out.println("before method :: x[0] :: "+x[0]);
		Sample.f1(x);
		System.out.println("after method :: x[0] :: "+x[0]);
	
	}

}
