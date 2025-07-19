package com.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNum {
	public static void main(String[] args) {
		String s="8734673638";
		String exp="[9876][0-9]{9}";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}

}
