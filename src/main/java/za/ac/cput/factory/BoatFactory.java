/*
BoatFactory.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 17 March 2026
*/

package za.ac.cput.factory;

import za.ac.cput.domain.Boat;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class BoatFactory {

    public static Boat createBoat(String boatNumber, String boatName, int capacity, LocalDate tripDate) {
        if (Helper.isNullOrEmpty(boatNumber) || Helper.isNullOrEmpty(boatName)) {
            return null;
        }

        if (capacity <= 0) {
            return null;
        }

        if (tripDate == null) {
            return null;
        }

        return new Boat.Builder()
                .setBoatNumber(boatNumber)
                .setBoatName(boatName)
                .setCapacity(capacity)
                .setTripDate(tripDate)
                .build();
    }
}