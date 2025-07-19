package com.Arrays;

import java.util.Arrays;

public class ToString {
	public static void main(String[] args) {
		int a[]= {3,2,4,5,6};
		m1(a);
		System.out.println(Arrays.toString(a));
	}
	public static void m1(int []b) {
		b[4]=30;
	}

}
