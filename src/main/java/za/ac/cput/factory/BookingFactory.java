package za.ac.cput.factory;

import za.ac.cput.domain.Booking;

import java.time.LocalDate;
import java.util.UUID;

public class BookingFactory {

    public static Booking createBooking(LocalDate bookingDate,
                                        String bookingParticipants,
                                        boolean pickupRequired) {

        int bookingNumber = Math.abs(UUID.randomUUID().hashCode());

        return new Booking.Builder()
                .setBookingNumber(bookingNumber)
                .setBookingDate(bookingDate)
                .setBookingParticipants(bookingParticipants)
                .setPickupRequired(pickupRequired)
                .build();
    }
}