package com;

public class StringDemo {
	
	public static void main(String[] args) {
		// Strings are immutable : content of obj can't modified
		// and all wrapper classes are immutable
		
		String s1="Abc";		
		System.out.println("s1: "+s1);
		System.out.println("s1 hashcode: "+s1.hashCode());
		System.out.println("s1 identity hashcode: "+System.identityHashCode(s1));
		//String s2="Abc";
		String s2=new String("Abc"); // new always goes to heap memory
		System.out.println("s2: "+s2);
		System.out.println("s2 hashcode: "+s2.hashCode());
		System.out.println("s2 identity hashcode: "+System.identityHashCode(s2));

		// equals method always compares content of objects
		
		if(s1.equals(s2)) { // == always compares identity hash codes
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		
	}

}
