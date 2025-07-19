package com.ExceptionHandling;

public class CustomException {
	public static void main(String[] args) {
		int age=46;
		if(age>=25&&age<=40) {
			System.out.println("Eligible");
		}
		else {
			AgeInvalidException a=new AgeInvalidException();
			throw a;
		}
	}

}
