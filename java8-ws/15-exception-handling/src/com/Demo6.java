package com;

public class Demo6 {
	// Throw demo

	public static void main(String[] args) {

		int age=5;
		try {
			int x = 10 / 2; // ??
			if(age<=17) {
				System.out.println("Not Eligible");
				throw new Exception("You are under age..");
				//System.out.println(">>> dead code <<<");
			}
			System.out.println("Eligible");
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("last line");
	} // end of main

}
