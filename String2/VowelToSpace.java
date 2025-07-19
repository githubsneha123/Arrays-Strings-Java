package com.String2;

public class VowelToSpace {
	public static void main(String args[]) {
		String s="javadev";
		int Vcount=0;
		char[]ch=s.toCharArray();
		for(int k=0;k<s.length();k++) {
			char c=s.charAt(k);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				Vcount++;
		}
		if(Vcount>=3) {
		   for(int i=0;i<s.length();i++) {
			  char c=ch[i];
			  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					 ch[i]=' ';			
			 
		   }
		   System.out.println(ch);
		}
		else
			 System.out.println(s);
	}

}
