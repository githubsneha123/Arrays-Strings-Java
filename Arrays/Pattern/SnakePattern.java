package com.Arrays.Pattern;

public class SnakePattern {
	public static void main(String[] args) {
		int n = 5;
		int[][] a = new int[n][n];
		int row = 0;
		int col = 0;
		for (int i = 1; i <= n * n; i++) {
			a[row][col]=i;
			if(col%2==0) {
				if(row<n-1)
					row++;
				else
					col++;
			}
		  
			else {
				if(row>0)
					row--;
				else
					col++;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
