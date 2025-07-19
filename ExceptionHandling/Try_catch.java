package com.ExceptionHandling;

public class Try_catch {
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println(10/0);//ArithmeticException a=new ArithmeticException();
		}
		catch(ArithmeticException e){
			System.out.println("handled");
		}
		System.out.println("main ends");
	}

}
