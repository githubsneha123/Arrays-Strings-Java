package com.ReverseString;

public class CountWords {
	public static void main(String args[]) {
		System.out.println(NumOfWords("  java is very easy  "));
	}
	public static int NumOfWords(String s) {
		int i=0;
		int count=0;
		while(i<s.length()) {
			if(s.charAt(i)!=' ' &&((i==0)|| s.charAt(i-1)==' '))
				count++;
			i++;
		}
		return count;
	}
}
