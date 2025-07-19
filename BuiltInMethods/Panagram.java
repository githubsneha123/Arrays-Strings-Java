package com.BuiltInMethods;

public class Panagram {
	public static void main(String args[]) {
		String s="A quick brown fox jumps over the lazy Dog";
		System.out.println(isPanagram(s));
	}
	public static boolean isPanagram(String s) {
		s=s.toLowerCase();
		if(s.length()<26) return false;
		for(char ch='a';ch<='z';ch++) {
			if(!s.contains(ch+"")) return false;
		}
		return true;
	}

}
