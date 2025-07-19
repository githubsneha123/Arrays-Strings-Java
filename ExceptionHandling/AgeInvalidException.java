package com.ExceptionHandling;

public class AgeInvalidException extends RuntimeException {

	public AgeInvalidException() {
		super("Invalid age- age limit(25 to 40)");
	}
	
}
