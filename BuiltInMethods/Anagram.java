package com.BuiltInMethods;

public class Anagram {
	public static void main(String args[]) {
		System.out.println(isAnagram("Peek","keep"));
	}
	public static  boolean isAnagram(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		while(true) {
			if(s1.length()!=s2.length()) return false;
			if(s1.length()==0&&s2.length()==0) return true;
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"","");
			s2=s2.replace(ch+"","");
		}
	}
}
