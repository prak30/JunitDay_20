package userreg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserRegistrationJunitTest {
	UserRegistration userRegistration = new UserRegistration();

//	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
//		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.firstName("Pranav");
		Assert.assertEquals(true, result);

	}

//	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
//		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.firstName("pranav");
		Assert.assertEquals(false, result);
	}

//	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Katkar");
		Assert.assertEquals(true, result);

	}

//	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("prnvkatkar88@gmail.com");
		Assert.assertEquals(true, result);
	}

//	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 9822418099");
		Assert.assertEquals(true, result);
	}
	
//	 @Test
	    public void givenPassword_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.password("prak@30");
	        Assert.assertEquals(true, result);
	    }

//	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password("pra@12345678");
		Assert.assertEquals(false, result);
	}
	
	 @Test
	    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.passwordRule2("Prak@3000");
	        Assert.assertEquals(true, result);
	    }

}
