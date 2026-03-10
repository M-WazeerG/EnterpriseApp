package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {
    public static boolean isNullOrEmpty(String string) {
        if ((string == null) || (string.isEmpty())) {
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(String email) {
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }
}
