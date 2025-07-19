package com.Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {5,3,7,2,8,1,0,6,-1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int [] a) {
		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index])
					index=j;
			}
			if(i!=index) {
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}

}
