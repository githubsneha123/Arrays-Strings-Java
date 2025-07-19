package com.BuiltInMethods;

public class MissingName {
	public static void main(String args[]) {
		String s1="sneha";
		String s2="nh";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(!s2.contains(ch+""))
				System.out.print(ch);
		}
	}

}
