package com.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
   public static void main(String[] args) {
	String s="abcdefabae";
	String exp="ab";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(s);
	int count=0;
	while(m.find())
		count++;
	System.out.println(exp+" = "+count);
   }
}
