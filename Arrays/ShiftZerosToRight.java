package com.Arrays;

import java.util.Arrays;

public class ShiftZerosToRight {
	public static void main(String[] args) {
		int[]a= {1,0,3,0,4,0,5,0,6,0};
		int[]b=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
				b[k++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
