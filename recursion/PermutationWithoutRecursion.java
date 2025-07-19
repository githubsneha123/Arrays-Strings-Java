package com.recursion;

public class PermutationWithoutRecursion {
	
	    public static void main(String[] args) {
	        String s = "abcd";
	        System.out.println("Given String is:"+s);
	        permutation(s);
	    }
	    public static void permutation(String s) {
	        int n = s.length();
	        for (int i = 0; i < n; i++) {
	            String s1 = swap(s, 0, i);
	            for (int j = 1; j < n; j++) {
	                String s2 = swap(s1, 1, j);
	                for (int k = 2; k < n; k++) {
	                    String s3 = swap(s2, 2, k);
	                    System.out.println(s3);
	                }
	            }
	        }
	    }
	    public static String swap(String s, int i, int j) {
	        char[] ch = s.toCharArray();
	        char temp = ch[i];
	        ch[i] = ch[j];
	        ch[j] = temp;
	        return new String(ch);
	    }
}                                                                              