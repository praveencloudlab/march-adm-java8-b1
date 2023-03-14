package com;

public class Student {
	private int regId;
	private String studentName;
	private long mobileNumber;
	
	private Exam exam;

	public Student(int regId, String studentName, long mobileNumber) {
		this.regId = regId;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
	}
	
	public void registerStudent() {
		System.out.println("registerStudent: "+this.hashCode());
		//pass on this student object to a Registar class
		Registar register = Registar.getRegistar();
		int admissionId = register.registerStudent(this);
	}
	
	public void registerForExam() {
		ExamRegistar examregistar = ExamRegistar.getExamregistar();
		 this.exam = examregistar.registeringStudentForExamination(this);
	}
	
	public void appearForExam() {
		Paper paper = exam.getPaper();
		String result = paper.submit();
		System.out.println("Result: "+result);
	}
	
	public int getRegId() {
		return regId;
	}

	public String getStudentName() {
		return studentName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

}
