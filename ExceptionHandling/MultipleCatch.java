package com.ExceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		int []a= {1,2,3};
		a=null;
		String s="13";
		try {
			int n=Integer.parseInt(s);
			System.out.println(n);
			System.out.println(a[2]/0);
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer exp");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception-Block");
		}
		//catch(ArithmeticException e) {}//CTE
	}

}
