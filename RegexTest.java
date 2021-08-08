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
		
		/*
		 * @Test public void test() { regex. }
		 */
		@Test
		public void testFirstName() {
			assertEquals(true, regex.validateFirstName("Pusarla"));
		}
		
		@Test(expected = InvalidInputException.class)
		public void testFirstNameNegativeScenario1() {
			regex.validateFirstName("pusarla#");
		}
		
		@Test(expected = NullPointerException.class)
		public void testFirstNameNegativeScenario() {
			regex.validateFirstName(null);
		}
		
		
		@Test
		public void testlastName() {
			assertEquals(true, regex.validatelastName("Naresh"));
		}
		
		@Test(expected = InvalidInputException.class)
		public void testLastNameNegativeScenario1() {
			regex.validatelastName("pusarla#");
		}
		
		@Test(expected = NullPointerException.class)
		public void testLastNegativeScenario() {
			regex.validatelastName(null);
		}
		
		@Test
		public void testemail() {
			assertEquals(true, regex.validateEmail("nareshsatya@gmail.com"));
		}
		
		@Test(expected = InvalidInputException.class)
		public void testEmailNegativeScenario1() {
			regex.validateEmail("pusarla#");
		}
		
		@Test(expected = NullPointerException.class)
		public void testEmailNegativeScenario() {
			regex.validateEmail(null);
		}
		
		@Test
		public void testMobileNumber() {
			assertEquals(true, regex.validateMobileNumber("91 9502574183"));
		}
		
		@Test(expected = InvalidInputException.class)
		public void testMobileNumberNegativeScenario1() {
			regex.validateMobileNumber("#hb545");
		}
		
		@Test(expected = NullPointerException.class)
		public void testMobileNumberNegativeScenario() {
			regex.validateMobileNumber(null);
		}
		
		@Test
		public void testPassword() {
			assertEquals(true, regex.validatePassword("Naresh123@"));
		}
		
		@Test(expected = InvalidInputException.class)
		public void testPasswordNegativeScenario1() {
			regex.validatePassword("#pusarla#");
		}
		
		@Test(expected = NullPointerException.class)
		public void testPasswordNegativeScenario() {
			regex.validatePassword(null);
		}
}
