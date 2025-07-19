package com.StringArray;

public class RemoveDupWord {
	public static void main(String args[]) {
		String s="Bangalore is Bangalore city is good city for It city";
		String str[]=s.split(" ");
		String res[] = new String[str.length];
		int k=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(""))
				continue;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])){
					str[j]="";
				}
			}
			res[k++]=str[i];
		}
		for(int i=0;i<k;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
