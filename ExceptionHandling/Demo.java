package com.ExceptionHandling;

public class Demo {
	public static void main(String[] args) {
		char ch=65;
		System.out.println(ch);
		int n='A';
		System.out.println(n);
		
		byte a=10+20;
		System.out.println(a);
		byte b=10;
		byte c=20;
		//byte d=b+c;//cte-int
		int e=10;
		int f=20;
		int d=e+f;
		System.out.println(d);
		
		//int m=Math.pow(5, 3);//cte-double
		int m=(int)Math.pow(5, 3);
		System.out.println(m);
		int s=0;
		s+=Math.pow(5, 3);
		System.out.println(s);
	}

}
