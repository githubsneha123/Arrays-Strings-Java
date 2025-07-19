package com.Arrays;

public class MaxElement {
	public static void main(String[] args) {
		int[]a= {8,5,3,9,1,2};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}

}
