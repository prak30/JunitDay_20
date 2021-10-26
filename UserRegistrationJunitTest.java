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

//	 @Test
	public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule2("Prak@3000");
		Assert.assertEquals(true, result);
	}

//	 @Test
	public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule3("Prak@3000");
		Assert.assertEquals(true, result);
	}

//	@Test
	public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule4("Prak!#3000");
		Assert.assertEquals(true, result);
	}
	
	 @Test
	    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.emailIdValidator("abc-");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenEmail2_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.emailIdValidator("abc@yahoo.com");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.emailIdValidator("abc@.com.my");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.emailIdValidator(".abc@abc.com");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.emailIdValidator("abc123@.com");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.emailIdValidator(".abc@abc.com");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
	        Assert.assertEquals(false, result);
	    }
	
	

}
