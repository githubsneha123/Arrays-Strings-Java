package com.ToCharArray;

public class Demo {
	public static void main(String args[]) {
		String s="sneha";
		char[] ch=s.toCharArray();
		System.out.println(ch[0]);
		System.out.println(ch[3]);
		ch[3]='H';
		System.out.println(ch[3]);
		//System.out.println(ch[5]);//ArrayIndexOutOfBoundsException
	}

}
