package com.ReverseString;

public class RevWords {
	public static void main(String args[]) {
		System.out.println(rev("java is very easy"));
	}
	public static String rev(String s) {
		String res="";
		int i=0;
		int j=0;
		while(j<s.length()) {
			while(j<s.length()&&s.charAt(j)!=' ') {
				j++;
			}
			int k=j-1;
			while(k>=i) {
				res+=s.charAt(k);
				k--;
			}
			if(j<s.length()) res+=" ";
			j++;
			i=j;
		}
		return res;
	}


}
