package com.Arrays_2D;

import java.util.Arrays;

public class AddTwoString {
	public static void main(String[] args) {
		int[][]a= {{1,2,1},{1,1,1},{1,0,1}};
		int [][]b= {{1,0,1},{1,2,1},{1,1,1}};
		int c[][]=new int [a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
					c[i][j]=a[i][j]+b[i][j];
			}
		}
		//System.out.println(Arrays.deepToString(c));
		for(int[]n:c) {
			System.out.println(Arrays.toString(n));
		}
	}

}
