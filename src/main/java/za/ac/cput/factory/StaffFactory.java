/*
StaffFactory.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 10 March 2026
*/

package za.ac.cput.factory;

import za.ac.cput.domain.Staff;
import za.ac.cput.util.Helper;

public class StaffFactory {
    public static Staff createStaff(String staffNumber, String firstName, String lastName, String phoneNumber, String staffEmail, String role) {
        if (Helper.isNullOrEmpty(staffNumber) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)) {
            return null;
        }

        if (!Helper.isValidEmail(staffEmail)){
            return null;
        }

        return new Staff.Builder()
                .setStaffNumber(staffNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setStaffEmail(staffEmail)
                .setRole(role)
                .build();
    }
}
