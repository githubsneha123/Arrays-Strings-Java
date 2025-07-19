package com.String2;

public class RemoDupChar {
	public static void main(String args[]) {
		String s="java@dev  ";
		String res="";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]=='\u0000')
				continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\u0000';
				}
			}
			res+=ch[i];
		}
		System.out.println(res);
	}

}
