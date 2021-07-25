package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		String regex_FirstName = "^[A-Z]{1}[a-z]{0,6}";
		String regex_LastName = "^[A-Z]{1}[a-z]{0,6}";
		String regex_for_email = "^[a-zA-Z0-9+._]+@[a-zA-Z0-9.]+$";
		String regex_for_mobileNumber = "^[0-9+ ]{0,3}[0-9]{0,10}";
		
		Pattern pattern = Pattern.compile(regex_FirstName);
		Matcher matcher = pattern.matcher("Pusarla");
		System.out.println("First name is "+matcher.matches());
		
		Pattern pattern1 = Pattern.compile(regex_LastName);
		Matcher matcher1 = pattern1.matcher("Naresh");
		System.out.println("Last name is "+matcher1.matches());
		
		Pattern pattern2 = Pattern.compile(regex_for_email);
		Matcher matcher2 = pattern2.matcher("naresh.pusarla@gmail.com.in");
		System.out.println("Valid email: "+matcher2.matches());

		Pattern pattern3 = Pattern.compile(regex_for_mobileNumber);
		Matcher matcher3 = pattern3.matcher("91 9502574183");
		System.out.println("Mobile number is "+matcher3.matches());
	}

}
