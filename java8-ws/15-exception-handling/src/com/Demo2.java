package com;

public class Demo2 {

	public static void main(String[] args) {
		
		try {
		System.out.println(">> 1.step1 :: ");
		int x=10/0;
		int i[]=new int[1];
		//i[10]=100;
		
		}catch(ArithmeticException e) {
			//System.out.println("Failed due to "+e);
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println(">>> test");
			aie.printStackTrace();
		}catch(Exception ee){
			ee.printStackTrace();
		}finally {
			System.out.println(">> always gets executed..");
			System.out.println(">> 2.step2 :: ");
		}
		
	

	}

}
