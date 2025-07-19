package com.Arrays;

public class MinElement {
	public static void main(String[] args) {
		int[]a= {8,5,3,9,1,2};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
		System.out.println("--------");
		for(int n:a) {
			if(n<min)
				min=n;
		}
		System.out.println(min);
	}

}
