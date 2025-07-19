package com.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {2,4,6,7,8,9};
		System.out.println(search(a,6));
	}
	public static int search(int a[],int key) {
		int st=0;
		int end=a.length-1;
		while(st<=end) {
			int mid=(st+end)/2;
			if(a[mid]==key) 
				return mid;
			else if(key<a[mid])
				end=mid-1;
			else if(key>a[mid])
				st=mid+1;
		}
		return -1;
	}

}
