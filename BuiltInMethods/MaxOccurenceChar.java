package com.BuiltInMethods;

public class MaxOccurenceChar {
	public static void main(String args[]) {
		String s1="jjjjjaava";
		String s2="";
		int max=0;
		char maxChar=' ';
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			System.out.println(ch+"="+count);
			if(count>max) {
				max=count;
				maxChar=ch;
			}
			s1=s2;
		}
		System.out.println("--------------------------");
		System.out.println(maxChar+"="+max);
	}

}
