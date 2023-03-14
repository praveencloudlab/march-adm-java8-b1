package com;

public class Validator {
	
	private static Validator validator;
	private Validator() {}
	
	public static Validator getValidator() {
		if(validator==null) {
			validator=new Validator();
		}
		return validator;
	}
	
	public boolean validateStudent(Student student) {
		System.out.println("validateStudent: "+student.hashCode());
		System.out.println("student is validated....");
		return true;
	}
		

}
