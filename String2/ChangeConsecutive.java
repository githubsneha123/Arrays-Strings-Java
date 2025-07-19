package com.String2;

public class ChangeConsecutive {
	public static void main(String args[]) {
		String s="Bossssss";
		String res="";
		char[]ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					ch[j]='$';
					break;
				}
			}
			res+=ch[i];
		}
		System.out.println(res);
	}

}
