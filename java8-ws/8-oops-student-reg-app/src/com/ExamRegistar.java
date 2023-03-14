package com;

public class ExamRegistar {
	
	private static ExamRegistar examRegistar;
	private ExamRegistar() {}
	
	public static ExamRegistar getExamregistar() {
		if(examRegistar==null) {
			examRegistar=new ExamRegistar();
		}
		return examRegistar;
	}

	public Exam registeringStudentForExamination(Student student) {
		
		// create paper
		Paper paper=new Paper();
		// pass paper object to Exam class
		Exam exam=new Exam(paper);
		return exam;
	}
}
