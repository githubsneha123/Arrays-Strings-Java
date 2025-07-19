package com.ExceptionHandling;

public class TryCatch2 {
	public static void main(String[] args) {
		int []a= {1,2,3};
		System.out.println("main starts");
		try {
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Handled");
		}
		System.out.println("main ends");

	}

}
