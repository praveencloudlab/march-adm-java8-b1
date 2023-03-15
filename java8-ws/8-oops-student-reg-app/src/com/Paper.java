package com;

public class Paper {
	
	
	
	public String submit() {
		Evaluator evaluator = Evaluator.getEvaluator();
		String result = evaluator.evalaute(this); // this means paper object
		return result;
	}

}
