package com.Arrays;

import java.util.Arrays;

public class ShiftZerosToLeft {
	public static void main(String[] args) {
		int[]a= {1,0,3,0,4,0,5,0,6,0};
		int[]b=new int[a.length];
		int count=0;
//		int k=a.length-1;
//		for(int i=a.length-1;i>=0;i--) {
//			if(a[i]!=0)
//				b[k--]=a[i];
//		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)
				count++;
		}
		int k=count;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
				b[k++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
