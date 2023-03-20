package com;

public class UserDefinedException {
	//UseDefined exceptions

	public static void main(String[] args) {

		int age=5;
		
		   try {
			int x = 10 / 2; // ??
			if(age<=17) {
				System.out.println("Not Eligible");
				throw new UnderAgeException("You are under age..");
				//throw new RuntimeException("You are under age..");
				//System.out.println(">>> dead code <<<");
			}
			System.out.println("Eligible");
		   }catch(UnderAgeException uae) {
			   uae.printStackTrace();
		   }

		System.out.println("last line"); // ???
	} // end of main

}
