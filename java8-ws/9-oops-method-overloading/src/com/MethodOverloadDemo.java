package com;

public class MethodOverloadDemo {
	
	void f1() {}
	//int f1() {return 100;} // invalid
	void f1(int x) {}
	void f1(float x) {}
	void f1(int x,int y) {}
	void f1(float x,float y) {}
	void f1(int x,float y) {}
	void f1(float x,int y) {}
	public static void main(String[] args) {
		
	}

}
