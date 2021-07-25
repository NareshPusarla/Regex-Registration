package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		String regex_FirstName = "^[A-Z][a-z]{0,6}";
		String regex_LastName = "^[A-Z][a-z]{0,6}";
		String regex_for_email = "^[a-zA-Z0-9+._]+@[a-zA-Z0-9.]+$";
		
		Pattern pattern = Pattern.compile(regex_FirstName);
		Matcher matcher = pattern.matcher("Pusarla");
		System.out.println("First name is "+matcher.matches());
		
		Pattern pattern1 = Pattern.compile(regex_FirstName);
		Matcher matcher1 = pattern1.matcher("Naresh");
		System.out.println("Last name is "+matcher1.matches());
		
		Pattern pattern2 = Pattern.compile(regex_for_email);
		Matcher matcher2 = pattern2.matcher("naresh.pusarla@gmail.com.in");
		System.out.println("Valid email: "+matcher2.matches());

	}

}
