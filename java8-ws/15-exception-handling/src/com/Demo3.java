package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo3 {

	public static void main(String[] args) {

		// Scanner sc=new Scanner(System.in);
		boolean status=true;
		while (status) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				System.out.println("Enter a number: ");
				// int x=sc.nextInt();
				int x = Integer.parseInt(br.readLine());
				System.out.println("x is " + x);
				status=false; 
			} catch (Exception e) {
				System.out.println("Invalid Input. try again: ");
			}

		} // end of while

	}

}
