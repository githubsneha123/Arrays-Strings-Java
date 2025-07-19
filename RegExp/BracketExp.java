package com.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketExp {
	public static void main(String[] args) {
		String s="abc.defab.ae";
		String exp="[ac]";//[.]
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
		   System.out.println(m.group());
	   }
}
