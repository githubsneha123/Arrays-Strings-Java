package com.StringArray;

public class UniqueWords {
	public static void main(String args[]) {
		String s="java is very easy java very";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			int count=1;
			if(str[i].equals(""))
				continue;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="";
				}
			}
			if(count==1) {
				System.out.print(str[i]+" ");
			}
		}
	}
}
