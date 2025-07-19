package com.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_3 {
	public static void main(String[] args) {
		String s="abc5defa$b2@ae";
		String exp="[^a-z0-9]";//[a-z0-9]
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
		   System.out.println(m.group());
	   }

}
