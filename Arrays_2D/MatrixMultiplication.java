package com.Arrays_2D;

import java.util.Arrays;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][]a= {{1,2,1},{1,1,1},{3,3,1}};
		int[][]b= {{2,2,1},{3,3,1},{1,1,2}};
		int[][]c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int n[]:c)
			System.out.println(Arrays.toString(n));
	}

}
