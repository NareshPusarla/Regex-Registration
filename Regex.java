package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	private final String regex_FirstName = "^[A-Z]{1}[a-z]{0,6}";
	private final String regex_LastName = "^[A-Z]{1}[a-z]{0,6}";
	private final String regex_for_email = "[0-9a-zA-Z]+([+._-]{1}[0-9a-zA-Z]+)?@[0-9a-zA-Z]+[.]{1}[a-zA-z]{2,4}([.]{1}[a-zA-z]{2,3})?$"+ "";
	private final String regex_for_mobileNumber = "^[0-9+ ]{0,3}[0-9]{0,10}";
	private final String regex_for_password = "^[A-Z]{1,10}[a-z]{3,10}[0-9]{1,20}[-+_.,!@#$%&*<>?]{1,10}";
	
	public boolean validateFirstName(String firstName) {
		return Pattern.matches(regex_FirstName, firstName);
	}
	
	public boolean validatelastName(String lastName) {
		return Pattern.matches(regex_LastName, lastName);
	}

	public boolean validateEmail(String email) {
		return Pattern.matches(regex_for_email, email);
	}

	public boolean validateMobileNumber(String number) {
		return Pattern.matches(regex_for_mobileNumber, number);
	}

	public boolean validatePassword(String password) {
		return Pattern.matches(regex_for_password, password);
	}

}
