package com.Arrays.Sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int []a= {2,7,3,8,1,0,5};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[]a,int st,int end) {
		if(st>end)
			return;
		int i=st;
		int j=end;
		int pivot=(i+j)/2;
		if(i<j) {
			while(a[i]<a[pivot])
				i++;
			while(a[j]>a[pivot])
				j--;
		}
		if(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		sort(a,st,j);
		sort(a,i,end);
	}

}
