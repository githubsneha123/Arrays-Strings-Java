package com.Arrays_2D;

public class PascalLaw {
	public static void main(String[] args) {
		int n=5;
		int[][]a=new int[n][];
		int sp=n-1;
		isPascal(a);
		for(int i=0;i<a.length;i++) {
			for(int k=0;k<=sp;k++) System.out.print(" ");
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			sp--;
			System.out.println();
		}
	}
	public static void isPascal(int [][]a) {
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0||i==j)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
	}

}
