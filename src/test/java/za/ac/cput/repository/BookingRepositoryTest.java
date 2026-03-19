package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookingRepositoryTest {

    private static BookingRepository repo = BookingRepository.getRepository();
    private static Booking booking = BookingFactory.createBooking(
            LocalDate.now(),
            "2 People",
            false
    );

    @Test
    void create() {
        Booking created = repo.create(booking);
        assertEquals(booking.getBookingNumber(), created.getBookingNumber());
    }

    @Test
    void read() {
        repo.create(booking);
        Booking read = repo.read(booking.getBookingNumber());
        assertNotNull(read);
    }

    @Test
    void update() {
        Booking updated = new Booking.Builder()
                .setBookingNumber(booking.getBookingNumber())
                .setBookingDate(LocalDate.now())
                .setBookingParticipants("5 People")
                .setPickupRequired(true)
                .build();

        repo.update(updated);
        assertEquals("5 People", updated.getBookingParticipants());
    }

    @Test
    void delete() {
        repo.create(booking);
        boolean success = repo.delete(booking.getBookingNumber());
        assertTrue(success);
    }

    @Test
    void getAll() {
        assertNotNull(repo.getAll());
    }
}
