package com.Arrays.Sorting;

import java.util.Arrays;

public class BuiltIn_Sort {
	public static void main(String[] args) {
		int a[]= {8,7,2,9,1,0,-1,4};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);
	}

}
