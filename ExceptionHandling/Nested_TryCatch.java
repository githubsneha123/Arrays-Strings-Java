package com.ExceptionHandling;

public class Nested_TryCatch {
	public static void main(String[] args) {
		System.out.println("main starts");
		int a[]= {1,2,3};
		try {
			System.out.println(10/2);
		    try {
			    System.out.println("Inner-Try");
			    System.out.println(a[2]/0);			
		    }
		    catch(ArithmeticException e) {
		    	System.out.println("Inner-catch");
		    }
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer-catch");
		}
		System.out.println("main ends");
		
	}

}
