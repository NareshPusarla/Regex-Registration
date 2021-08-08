package com.bridgelabz.regex;

public class InvalidInputException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	public InvalidInputException(String message) {
		super();
		this.message = message;
	}
	
}
