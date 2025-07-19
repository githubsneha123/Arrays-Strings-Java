package com.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Blackslace {
	public static void main(String[] args) {
		String s="sn\\eh\\a\\";
		String exp="\\\\";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}

}
