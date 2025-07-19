package com.ToCharArray;

public class AscChar {
	public static void main(String args[]) {
		String s="java";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
			   if(ch[i]>ch[j]) {
				   char val=ch[i];
				   ch[i]=ch[j];
				   ch[j]=val;
			   }
			}
		}
		System.out.println(ch);
	}

}
