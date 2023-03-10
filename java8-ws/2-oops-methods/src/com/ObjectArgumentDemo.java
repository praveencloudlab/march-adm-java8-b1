package com;

class Person{
	int id;
	String name;
	
	void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}
	
	static void displayPerson(Person obj) {// obj : formal
		System.out.println("Person ID: "+obj.id);
		System.out.println("Person Name: "+obj.name);
	}
	
}

public class ObjectArgumentDemo {
	
	public static void main(String[] args) {
		Person p=new Person();
		p.id=100;
		p.name="Abc";
		p.display();
		
		Person.displayPerson(p); // p is actual argument
		
		
		
		
	}
	
	

}
