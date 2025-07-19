package com.ExceptionHandling;

public class TryCatch3 {
	public static void main(String[] args) {
		System.out.println("main starts");
		String s=null;
		try {
			System.out.println(s.length());
			System.out.println("try block");
		}
		catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("Exception handled");
		}
		System.out.println("main ends");
	}

}
