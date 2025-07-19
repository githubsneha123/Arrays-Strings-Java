package com.StringArray;

public class StrMemory {
	public static void main(String args[]) {
		String s1="java";//scp
		String s4="java";
		String s2=new String("java");//heap
		String s3="Java";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		s1="sql";
		System.out.println(s1);
		System.out.println(s4);
		
		
		
	}

}
