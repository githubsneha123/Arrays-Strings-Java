package com.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {1,3,7,5,3,8};
		System.out.println(linear(a,50));
	}
	public static int linear(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}

}
