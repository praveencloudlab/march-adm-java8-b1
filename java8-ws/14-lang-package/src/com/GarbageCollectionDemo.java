package com;

class Person{
	static int counter=1;
	@Override
	protected void finalize() throws Throwable {
		System.out.println((counter++) +">>> Person object is garbage collected ");
	}
	
}


public class GarbageCollectionDemo {

	public static void main(String[] args) {
		
		System.out.println(">>> main method");
		
		
		//Person p=new Person(); // allots memory in heap
		//p=null; // deallocates memory  : object can be garbage collected..
		
		//System.gc();
		
		
		for(int i=1;i<=1850000;i++) {
			new Person();
		}
		
		
		/*
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.totalMemory());
		System.out.println(rt.freeMemory());
		System.out.println(rt.availableProcessors());
		*/
		
		
		
		
		
	}

}
