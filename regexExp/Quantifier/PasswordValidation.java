package com.regexExp.Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	public static void main(String[] args) {
		String exp="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_]).{4,8}";
		String s="Sne@123";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("invalid");
	}

}
