package com.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_2 {
	public static void main(String[] args) {
		String s="abc4defab6ae";
		String exp=".[0-9]a";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
		   System.out.println(m.group());
	   }
}
