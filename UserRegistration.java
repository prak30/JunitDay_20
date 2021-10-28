package userreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String EMAIL_ADDRESS_PATTERN = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";

	public boolean firstName(String firstName) throws UserDefinedExceptions {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		try {
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		}catch (UserDefinedExceptions e) {
			System.out.println("Exception:" +e.getMessage());
			
		}

		return matcher.matches();
	}

	public boolean lastName(String lastName) throws UserDefinedExceptions {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean email(String email) throws UserDefinedExceptions {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean phoneNumber(String phoneNumber) throws UserDefinedExceptions {
		String regex = "^[0-9]{2}+[\s]+[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean password(String password) throws UserDefinedExceptions {
		String regex = "^[A-Z a-z 0-9]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean passwordRule2(String password) throws UserDefinedExceptions {
		String regex = "(?=.*[A-Z]).{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean passwordRule3(String password) throws UserDefinedExceptions {
		String regex = "(?=.*[A-Z])(?=.*[0-9]).{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean passwordRule4(String password) throws UserDefinedExceptions {
		String regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&!]).{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean emailIdValidator(String emailId) throws UserDefinedExceptions {
		Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
		Matcher matcher = pattern.matcher(emailId);
		if (!matcher.matches()) {
			throw new UserDefinedExceptions("Enter a valid pattern");
		}
		return matcher.matches();
	}
	
	public static void main(String[] args) throws UserDefinedExceptions {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstName("pranav");
	//	userRegistration.lastName("Katkar");
	}
}
