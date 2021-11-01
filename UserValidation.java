package userreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserValidation {
    public static boolean firstNameValidation(String firstName) throws UserValidationException {
        try {
            UserValidate<String> obj = (fn) -> {
                String regex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(fn);
                return matcher.matches();
            };
            return obj.validate(firstName);

        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }

    public static boolean lastNameValidation(String lastName) throws UserValidationException {
        try {
            UserValidate<String> obj = (ln) -> {
                String regex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(ln);
                return matcher.matches();
            };
            return obj.validate(lastName);

        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }

    public static boolean emailValidation(String email) throws UserValidationException {
        try {
            UserValidate<String> obj = (em) -> {
                String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(em);
                return matcher.matches();
            };
            return obj.validate(email);
        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }

    public static boolean phoneNumberValidation(String phoneNumber) throws UserValidationException {
        try {
            UserValidate<String> obj = (pn) -> {
                String regex = "^[0-9]{2}+[\s]+[0-9]{10}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(pn);
                return matcher.matches();
            };
            return obj.validate(phoneNumber);
        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }

    public static boolean passwordValidation(String password) throws UserValidationException {
        try {
            UserValidate<String> obj = (ps) -> {
                String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(ps);
                return matcher.matches();
            };
            return obj.validate(password);
        } catch (NullPointerException exception) {
            throw new UserValidationException("Invalid input");
        }
    }
}