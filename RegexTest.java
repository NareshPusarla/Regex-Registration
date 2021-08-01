package com.bridgelabz.regex;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class RegexTest {

		private Regex regex;
		
		@Before
		public void setup() {
			regex = new Regex();
		}
	
		public static void main(String[] args) throws RegexException {
			RegexTest rx = new RegexTest();
			
			try {
			rx.testFirstName();
			rx.testlastName();
			rx.testemail();
			rx.testMobileNumber();
			rx.testPassword();
			}
			catch(Exception e){
				throw new RegexException("Check the format once again.");
			}
			
			rx.testFirstNameNegativeScenario();
			rx.testLastNegativeScenario();
			rx.testEmailNegativeScenario();
			rx.testPasswordNegativeScenario();
			rx.testMobileNumberNegativeScenario();
			
		}
		
		@Test
		public void testFirstName() {
			assertEquals(true, regex.validateFirstName("Pusarla"));
		}
		
		@Test(expected = NullPointerException.class)
		public void testFirstNameNegativeScenario() {
			assertEquals(true, regex.validateFirstName(null));
		}
		
		@Test
		public void testlastName() {
			assertEquals(true, regex.validatelastName("Naresh"));
		}
		
		@Test(expected = NullPointerException.class)
		public void testLastNegativeScenario() {
			assertEquals(true, regex.validatelastName(null));
		}
		
		@Test
		public void testemail() {
			assertEquals(true, regex.validateEmail("nareshsatya@gmail.com"));
		}
		
		@Test(expected = NullPointerException.class)
		public void testEmailNegativeScenario() {
			assertEquals(true, regex.validateEmail(null));
		}
		
		@Test
		public void testMobileNumber() {
			assertEquals(true, regex.validateMobileNumber("91 9502574183"));
		}
		
		@Test(expected = NullPointerException.class)
		public void testMobileNumberNegativeScenario() {
			assertEquals(true, regex.validateMobileNumber(null));
		}
		
		@Test
		public void testPassword() {
			assertEquals(true, regex.validatePassword("Naresh123@"));
		}
		
		@Test(expected = NullPointerException.class)
		public void testPasswordNegativeScenario() {
			assertEquals(true, regex.validatePassword(null));
		}
}
