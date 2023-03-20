package com;

public class Demo1 {

	public static void main(String[] args) {
		
		try {
		System.out.println(">> 1.step1 :: ");
		int x=10/2;
		
		}catch(Exception e) {
			//System.out.println("Failed due to "+e);
			e.printStackTrace();
		}finally {
			System.out.println(">> always gets executed..");
		}
		
		System.out.println(">> 2.step2 :: ");

	}

}
