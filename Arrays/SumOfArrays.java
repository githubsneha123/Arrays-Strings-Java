package com.Arrays;

import java.util.Arrays;

public class SumOfArrays {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8};
		int[]b= {1,2,3,4,5};
		int c=a.length<b.length?a.length:b.length;
		for(int i=0;i<c;i++) {
			if(a.length<b.length)
				b[i]+=a[i];
			else
				a[i]+=b[i];
		}
		if(a.length<b.length)
		     System.out.println(Arrays.toString(b));
		else
			System.out.println(Arrays.toString(a));
			
	}

}
