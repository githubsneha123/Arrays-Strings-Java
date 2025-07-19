package com.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_5 {
	public static void main(String[] args) {
		String s="baFaBaEeGena";
		String exp="([a-z])([A-Z])\\1";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}
}
