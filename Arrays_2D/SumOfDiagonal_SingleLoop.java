package com.Arrays_2D;

public class SumOfDiagonal_SingleLoop {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 4 }, { 3, 6, 5 }, { 7, 3, 2 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][i];
			if (i != a.length - 1 - i)
				sum += a[i][a.length - 1 - i];
		}
		System.out.println(sum);
	}

}
