package com.StringArray;

public class RevWord {
	public static void main(String args[]) {
		String s="java is very easy";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.print(rev(str[i]+" "));
		}
	}
	public static String rev(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		return res;
	}
}
