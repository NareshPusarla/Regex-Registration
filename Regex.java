package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		String regex_FirstName = "^[A-Z][a-z]{0,6}";
		
		Pattern pattern = Pattern.compile(regex_FirstName);
		Matcher matcher = pattern.matcher("Naresh");
		System.out.println("First name is "+matcher.matches());
	}

}
