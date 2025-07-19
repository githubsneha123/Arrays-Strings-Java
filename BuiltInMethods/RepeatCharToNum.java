package com.BuiltInMethods;

public class RepeatCharToNum {
	
	    public static void main(String[] args) {
	        /*String input = "Hello World";
	        String output = "";
	        int[] totalCount = new int[128];  
	        int[] seenCount = new int[128];   
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch != ' ') {
	                totalCount[ch]++;
	            }
	        }
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (ch == ' ') {
	                output += " ";
	            } else if (totalCount[ch] > 1) {
	                seenCount[ch]++;
	                output += seenCount[ch];
	            } else {
	                output += ch;
	            }
	        }

	        System.out.println(output);*/
	    	
	    	String s = "Hello World";
	        char[]ch=s.toCharArray();
	        for(int i=0;i<s.length();i++) {
	        	char count='1';
	        	for(int j=i+1;j<s.length();j++) {
	        		if(ch[i]>='A'&&ch[i]=='Z'||ch[i]>='a'&&ch[i]<='z') {
	        			if(ch[i]==ch[j]) {
	        				count++;
	        				ch[j]=count;
	        			}
	        		}
	        	}
	        	if(count!='1') {
	        		ch[i]='1';
	        	}
	        }
	        System.out.println(ch);
	        
	    }
	
}
