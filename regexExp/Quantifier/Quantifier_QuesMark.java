package com.regexExp.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier_QuesMark {
	public static void main(String[] args) {
		String s="ababbbabbbbbbbabaab";
		String exp="ab?";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}

}
