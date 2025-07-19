package com.Arrays;

public class NumberString {
	public static void main(String[] args) {
		int n=18000056;
		pw(n/10000000," crore ");
		pw((n/100000)%100," lakhs ");
		pw((n/1000)%100," thousand ");
		pw((n/100)%10," hundred ");
		pw(n%100,"");
	}
	public static void pw(int num,String s) {
		String []one= {"","One",       "Two",      "Three",
	            "Four",    "Five",      "Six",      "Seven",
	            "Eight",   "Nine",      "Ten",      "Eleven",
	            "Twelve",  "Thirteen",  "Fourteen", "Fifteen",
	            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	            };
		String []two={ 
	            "",     "",     "Twenty",  "Thirty", "Forty",
	            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" 
	         };
		if(num<=19)
			System.out.print(one[num]+" ");
		else
			System.out.print(two[num/10]+" "+one[num%10]+" ");
		if(num!=0)
			System.out.print(s);
	}
}
