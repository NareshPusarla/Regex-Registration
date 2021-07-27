package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	private final static String regex_FirstName = "^[A-Z]{1}[a-z]{0,6}";
	private final static String regex_LastName = "^[A-Z]{1}[a-z]{0,6}";
	private final static String regex_for_email = "^[a-zA-Z0-9+._]+@[a-zA-Z0-9.]+$";
	private final static String regex_for_mobileNumber = "^[0-9+ ]{0,3}[0-9]{0,10}";
	private final static String regex_for_password = "^[A-Z]{1,}[a-z]{7,}[0-9]{1,20}[-+_.,!@#$%&*<>?]{1}";


	public static void main(String[] args) {
				
		validateFirstName();
		validatelasttName();
		validateEmail();
		validateMobileNumber();
		validatePassword();
	}
	
	public static void validateFirstName() {
		Pattern pattern = Pattern.compile(regex_FirstName);
		Matcher matcher = pattern.matcher("Pusarla");
		System.out.println("First name is "+matcher.matches());
	}
	
	public static void validatelasttName() {
		Pattern pattern1 = Pattern.compile(regex_LastName);
		Matcher matcher1 = pattern1.matcher("Naresh");
		System.out.println("Last name is "+matcher1.matches());
	}

	public static void validateEmail() {
		Pattern pattern2 = Pattern.compile(regex_for_email);
		Matcher matcher2 = pattern2.matcher("abc@.com.my");
		System.out.println("Valid email: "+matcher2.matches());
	}

	public static void validateMobileNumber() {
		Pattern pattern3 = Pattern.compile(regex_for_mobileNumber);
		Matcher matcher3 = pattern3.matcher("91 9502574183");
		System.out.println("Mobile number is "+matcher3.matches());
	}

	public static void validatePassword() {
		Pattern pattern4 = Pattern.compile(regex_for_password);
		Matcher matcher4 = pattern4.matcher("Password5-");
		System.out.println("Password is "+matcher4.matches());
	}

}
