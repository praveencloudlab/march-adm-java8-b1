package com;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student(100, "Praveen", 38434);
		System.out.println("main: "+s1.hashCode());
		s1.registerStudent(); // registerStudent() invoked by s1 object
		s1.registerForExam();
		s1.appearForExam();
	

	}

}
