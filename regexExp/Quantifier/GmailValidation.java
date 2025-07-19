package com.regexExp.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailValidation {
	public static void main(String[] args) {
		String exp="[a-z][a-z0-9!@#$%^&*()_+]+@gmail[.]com";
		String s="sne!@gmail.com";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("invalid");
	}
}
