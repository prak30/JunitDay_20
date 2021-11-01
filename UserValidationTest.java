package userreg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserValidationTest {
	
	 @Test
	    public void givenFirstName_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = true;
	        try {
	            actualResult = validation.firstNameValidation("Pranav");
	        } catch (UserValidationException exception) {
	            Assert.assertEquals(actualResult, exception.message);
	        }
	    }

	    @Test
	    public void giveLastName_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = true;
	        try {
	            actualResult = validation.lastNameValidation("Katkar");
	        } catch (UserValidationException exception) {
	            Assert.assertEquals(actualResult, exception.message);
	        }
	    }

	    @Test
	    public void givenEmail_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = true;
	        try {
	            actualResult = validation.emailValidation("pkat007@gmail.com");
	        } catch (UserValidationException exception) {
	            Assert.assertEquals(actualResult, exception);
	        }
	    }

	    @Test
	    public void givenPhoneNumber_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = true;
	        try {
	            actualResult = validation.phoneNumberValidation("+91 8543695700");
	        } catch (UserValidationException exception) {
	            Assert.assertEquals(actualResult, exception.message);
	        }
	    }

	    @Test
	    public void givenPassword_Validation() {
	        UserValidation validation = new UserValidation();
	        boolean actualResult = true;
	        try {
	            actualResult = validation.passwordValidation("qw1rt@Ms");
	        } catch (UserValidationException exception) {
	            Assert.assertEquals(actualResult, exception.message);
	        }
	    }
	}
