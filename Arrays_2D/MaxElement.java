package com.Arrays_2D;

public class MaxElement {
	public static void main(String[] args) {
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int max=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		System.out.println(max);
	}

}
