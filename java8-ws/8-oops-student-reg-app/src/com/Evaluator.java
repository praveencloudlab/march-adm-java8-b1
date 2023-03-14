package com;

public class Evaluator {
	private static Evaluator evaluator;
	private Evaluator() {}
	
	public static Evaluator getEvaluator() {
		if(evaluator==null) {
			evaluator=new Evaluator();
		}
		return evaluator;
	}
	
	public String evalaute(Paper paper) {
		return "Pass";
	}

}
