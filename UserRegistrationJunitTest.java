package userreg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserRegistrationJunitTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.firstName("Pranav");
		Assert.assertEquals(true, result);

	}
	
	@Test
	 public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
		UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstName("pranav");
        Assert.assertEquals(false, result);
    }
	
	

}
