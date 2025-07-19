package com.BuiltInMethods;

public class MissingVowel {
	public static void main(String args[]) {
		String s1="aeiouAEIOU";
		String s2="India";
	    for(int i=0;i<s1.length();i++) {
	    	char ch=s1.charAt(i);
	    	if(!s2.contains(ch+"")) 
	    		 System.out.print(ch);
	    }
	   
	}

}
