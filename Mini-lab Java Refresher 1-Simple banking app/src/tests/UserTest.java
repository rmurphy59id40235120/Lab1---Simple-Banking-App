package tests;

import java.util.Date;
import model.User;
import model.Account;
import model.Transaction;

public class UserTest {

	public static void main(String[] args) {
		
		/* OLD MANUAL TESTING
		//User testUser = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
		System.out.println(testUser);
		*/
		
		// Automated Testing
		
		// 1 - Setup the object and test data, initialise
		// See the four steps in:
		String test_username = "mike";
		String test_password = "my_passwd";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		// 2 - Exercise, run the object under test
		User testUser = new User(test_username, test_password, test_first_name, 
				test_last_name, test_mobile_number);
		
		// 3 - Verify (Assert)
		Boolean passed = true;
		
		if (testUser.getUsername() != test_username) {
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}
		
		if (testUser.getPassword() != test_password) {
			System.out.println("TC2 failed: password did not match");
			passed = false;
		}
		
		if (testUser.getFirst_name() != test_first_name) {
			System.out.println("TC3 failed: first name did not match");
			passed = false;
		}
		
		if (testUser.getLast_name() != test_last_name) {
			System.out.println("TC4 failed: last name did not match");
			passed = false;
		}
		
		if (testUser.getMobile_number() != test_mobile_number) {
			System.out.println("TC5 failed: mobile number did not match");
			passed = false;
		}
		
		if (passed) {
			System.out.println("All TC's passed.");
		}
		
		// Using asserts
		assert testUser.getUsername() == test_username;
		assert testUser.getPassword() == test_password;
		assert testUser.getFirst_name() == test_first_name;
		assert testUser.getLast_name() == test_last_name;
		assert testUser.getMobile_number() == test_mobile_number;
		//assert 1==2;
		
		System.out.println("All Java assertions in the test suite passed (none failed).");
	}
}
