package com.ToCharArray;

public class ReplacChar {
	public static void main(String args[]) {
		String s="java";
		System.out.println(replace(s,'a','$'));
	}
	public static String replace(String s,char ch1,char key) {
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]==ch1) {
				ch[i]=key;
			}
		}
		return new String(ch);
	}
}
