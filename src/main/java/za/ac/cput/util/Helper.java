/*
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
*/

package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
        return (str == null) || (str.isEmpty());
    }

    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }
}
