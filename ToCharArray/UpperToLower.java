package com.ToCharArray;

public class UpperToLower {
	public static void main(String args[]) {
		String s="SNeHa@Kr";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i]-=32;
			}
			else if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
		System.out.println(ch);
	}

}
