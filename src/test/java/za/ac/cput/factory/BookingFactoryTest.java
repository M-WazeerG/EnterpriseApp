package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @Test
    void createBooking() {
        Booking booking = BookingFactory.createBooking(
                LocalDate.now(),
                "3 People",
                true
        );

        assertNotNull(booking);
        assertNotNull(booking.getBookingNumber());
    }
}