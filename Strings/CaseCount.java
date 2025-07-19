package com.Strings;

public class CaseCount {
	public static void main(String args[]) {
		String s="Sneha@123KR*";
		int uc=0,lc=0,nc=0,sp=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') uc++;
			else if(ch>='a' && ch<='z') lc++;
			else if(ch>='0' && ch<='9') nc++;
			else sp++;
		}
		System.out.println("Uc count:"+uc);
		System.out.println("Lc count:"+lc);
		System.out.println("Nc count:"+nc);
		System.out.println("Sp count:"+sp);	
		
		
	}

}
