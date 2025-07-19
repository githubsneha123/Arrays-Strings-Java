package com.Arrays_2D;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int [][]a= {{9,8,7},
				     {6,5,4},
				     {3,2,1}
		            };
		int [][]b=new int[a.length][a.length];
		int [] temp=new int[a.length*a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				temp[k++]=a[i][j];
			}
		}
		//Arrays.sort(temp);
		for(int i=0;i<temp.length-1;i++) {
			for(int j=i+1;j<temp.length;j++) {
				if(temp[i]>temp[j]) {
					int val=temp[i];
					temp[i]=temp[j];
					temp[j]=val;
				}
			}
		}
		
		k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				b[i][j]=temp[k++];
			}
		}
		for(int n[]:b)
			System.out.println(Arrays.toString(n));
		
	}

}
