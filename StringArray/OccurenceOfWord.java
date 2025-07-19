package com.StringArray;

public class OccurenceOfWord {
	public static void main(String args[]) {
		String s="java is very easy java very ";
		String[] str=s.split(" ");
		int count=1;
		for(int i=0;i<str.length;i++){
			count=1;
			if(str[i].equals(""))
				continue;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="";
				}
			}
			System.out.println(str[i]+" = "+count);
		}
	}
}
