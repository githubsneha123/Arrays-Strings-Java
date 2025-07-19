package com.regexExp.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CombinedQuantifier {
	public static void main(String[] args) {
		String s="accbaaccabbbbbbabbcccacabc";
		String exp="ab*c+";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}

}
