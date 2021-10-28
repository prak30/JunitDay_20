package userreg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class EmailValidatorParameterisedTest {
//	UserRegistration userRegistration = new UserRegistration();
	private String email2Test;
	private boolean expectedResult;
//	private EmailValidatorParameterisedTest emailValidatorParameterisedTest;

	public EmailValidatorParameterisedTest(String emailId, boolean expectedResult) {
		this.email2Test = emailId;
		this.expectedResult = expectedResult;
	}

//	@Before
//	   public void initialize() {
//		 emailValidatorParameterisedTest = new EmailValidatorParameterisedTest(String email2Test, boolean expectedResult);
//	   }

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { " abc@.com.my ", false },
				{ "abc123@gmail.a", false }, { "abc123@.com", false }, { "abc123@.com.com", false },
				{ ".abc@abc.com ", false }, { "abc()*@gmail.com", false }, { "abc@%*.com", false },
				{ "abc..2002@gmail.com ", false }, { "abc.@gmail.com", false }, { "abc@abc@gmail.com", false },
				{ "abc@gmail.com.1a", false }, { "abc@gmail.com.aa.au", false } });
	}

	@Test
	void givenEmailAsVariable_ShouldReturnAsPerParameterisedResults() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.emailIdValidator(this.email2Test);
		Assert.assertEquals(this.expectedResult, result);

	}

}
