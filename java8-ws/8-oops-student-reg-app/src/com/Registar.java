package com;

public class Registar {
	
	private static Registar registar=null;
	private  Registar() {}
	
	public static Registar getRegistar() {
		if(registar==null) {
			registar=new Registar();
		}
		return registar;
	}
	
	public int registerStudent(Student student) {
		System.out.println("admitStudent: "+student.hashCode());
		Validator validator = Validator.getValidator();
		boolean status = validator.validateStudent(student);
		
		//System.out.println("student admisted successfully...");
		return 1000;
	}
	
	
	

}
