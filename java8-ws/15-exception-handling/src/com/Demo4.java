package com;

import java.util.Scanner;

public class Demo4 {
	
	static void f1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=sc.nextInt();
		System.out.println("x is "+x);
	}

	public static void main(String[] args) {
		
		Demo4 d4=new Demo4();
		
		Runnable t1=()->{
			f1();
		};
		
		Runnable t2=()->{
			System.out.println(">>> ending..");
		};
		
		Thread obj1=new Thread(t1);
		Thread obj2=new Thread(t2);
		
		obj1.start();
		obj2.start();
		
		
		
		
	
	}

}
