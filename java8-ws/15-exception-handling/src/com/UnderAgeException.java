package com;

public class UnderAgeException extends RuntimeException{
	/**
	 * if class extends Exception class, then its CheckedException
	 * if class extends RuntimeException, then its UnCkecked : runtime
	 */
	
	public UnderAgeException(String msg) {
		super(msg); 
	}

}
