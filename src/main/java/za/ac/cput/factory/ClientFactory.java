package za.ac.cput.factory;

import za.ac.cput.domain.Client;
import za.ac.cput.util.Helper;

public class ClientFactory {
    public static Client createClient(String userId,String firstName, String lastName, String email, String phoneNumber, String nationality) {
        if (Helper.isNullOrEmpty(userId) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)) {
            return null;
        }

        if(!Helper.isValidEmail(email)){
            return null;
        }

        return new Client.Builder().setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setNationality(nationality)
                .build();
    }
}
