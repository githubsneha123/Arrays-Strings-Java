package com.Strings;

public class ArrangeChar {
	public static void main(String args[]) {
		String s="Sneha@123K#R*";
		String lower="",upper="",num="",spch="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') upper+=ch;
			else if(ch>='a' && ch<='z') lower+=ch;
			else if(ch>='0' && ch<='9') num+=ch;
			else spch+=ch;
		}
		System.out.println(spch+num+lower+upper);
	}

}
