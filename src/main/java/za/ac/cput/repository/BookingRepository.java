package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.HashSet;
import java.util.Set;

public class BookingRepository implements IBookingRepository {

    private static BookingRepository repository = null;
    private Set<Booking> bookingDB;

    private BookingRepository() {
        bookingDB = new HashSet<>();
    }

    public static BookingRepository getRepository() {
        if (repository == null) {
            repository = new BookingRepository();
        }
        return repository;
    }

    @Override
    public Booking create(Booking booking) {
        bookingDB.add(booking);
        return booking;
    }

    @Override
    public Booking read(Integer bookingNumber) {
        return bookingDB.stream()
                .filter(b -> b.getBookingNumber() == bookingNumber)
                .findAny()
                .orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        Booking oldBooking = read(booking.getBookingNumber());
        if (oldBooking != null) {
            bookingDB.remove(oldBooking);
            bookingDB.add(booking);
            return booking;
        }
        return null;
    }

    @Override
    public boolean delete(Integer bookingNumber) {
        Booking booking = read(bookingNumber);
        if (booking != null) {
            bookingDB.remove(booking);
            return true;
        }
        return false;
    }

    @Override
    public Set<Booking> getAll() {
        return bookingDB;
    }
}
