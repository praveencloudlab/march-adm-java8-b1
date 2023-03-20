package com;

public class Demo7 {
	// Runtime exception / unchecked exception

	public static void main(String[] args) {

		int age=5;
		
			int x = 10 / 2; // ??
			if(age<=17) {
				System.out.println("Not Eligible");
				throw new RuntimeException("You are under age..");
				//System.out.println(">>> dead code <<<");
			}
			System.out.println("Eligible");

		System.out.println("last line");
	} // end of main

}
