package com.BuiltInMethods;

public class Split {
	public static void main(String args[]) {
		String s="java is very easy";
		String []str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
