package com.BuiltInMethods;

public class MinOccurenceChar {
	public static void main(String args[]) {
		String s1="jjjjjaavas";
		String s2="";
		int min=s1.length();
		String minChar="";
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			System.out.println(ch+"="+count);
			if (count < min) {
                min = count;
                minChar = "" + ch;
            } else if (count == min) {
                minChar += ch; 
            }
			s1=s2;
		}
		System.out.println("--------------------------");
		for (int i = 0; i < minChar.length(); i++) {
            System.out.println(minChar.charAt(i) + "=" + min);
        }
	}


}
