package com.StringArray;

public class RevSentence {
	public static void main(String args[]) {
		String s="java is very easy";
		String []str=s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
	}
}
