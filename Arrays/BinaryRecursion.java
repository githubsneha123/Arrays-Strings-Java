package com.Arrays;

public class BinaryRecursion {
	public static void main(String[] args) {
		int a[]= {2,4,6,7,8,9,10};
		System.out.println(search(a,10,0,a.length-1));
	}
	public static int search(int a[],int key,int st,int end) {
	
		if(st>end) 
			return -1;
		int mid=(st+end)/2;
		if(a[mid]==key) 
			return mid;
		else if(key<a[mid])
			end=mid-1;
		else if(key>a[mid])
			st=mid+1;
		return search(a,key,st,end);
	}


}
