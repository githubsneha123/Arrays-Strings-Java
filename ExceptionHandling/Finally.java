package com.ExceptionHandling;

public class Finally {
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println("DB open");
		try {			
			System.out.println("DB Sending data...");
			System.out.println(10/0);
			return;
		}
		catch(ArithmeticException e){
			System.out.println("handled");
		}
		finally {
			System.out.println("DB close");
		}
		System.out.println("main ends");
	}

}
