package com.Arrays_2D;

public class SumOfDiagonal {
	public static void main(String[] args) {
		int[][]a= {{1,2,4},{3,6,5},{7,3,2}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j||i+j==a.length-1)
					sum+=a[i][j];
			}
		}
		System.out.println(sum);
	}

}
