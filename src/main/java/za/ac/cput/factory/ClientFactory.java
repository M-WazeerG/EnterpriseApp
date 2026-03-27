/*
ClientFactory.java
Author: Mogamat Wazeer Gilbert (221374698)
Date: 16 March 2025
*/

package za.ac.cput.factory;

import za.ac.cput.domain.Client;
import za.ac.cput.util.Helper;

public class ClientFactory {
    public static Client createClient(String clientNumber,String firstName, String lastName, String email, String phoneNumber,String address, String nationality) {
        if (Helper.isNullOrEmpty(clientNumber) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)) {
            return null;
        }

        if(!Helper.isValidEmail(email)){
            return null;
        }

        return new Client.Builder().setClientNumber(clientNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setAddress(address)
                .setNationality(nationality)
                .build();
    }
}
