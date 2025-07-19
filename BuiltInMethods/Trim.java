package com.BuiltInMethods;

public class Trim {
	public static void main(String args[]) {
		String s1="   java is very easy   ";
		System.out.println(s1.length());
		s1=s1.trim();
		System.out.println(s1.length());
	}
}
