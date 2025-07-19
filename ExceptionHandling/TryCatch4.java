package com.ExceptionHandling;

public class TryCatch4 {
	public static void main(String[] args) {
		String s="20w";
		int n=0;
		try {
			n=Integer.parseInt(s);
			System.out.println(n/2);
		}catch(NumberFormatException | ArithmeticException e ) {
			System.out.println(e);
			System.out.println("Handled");
		}
	}

}
