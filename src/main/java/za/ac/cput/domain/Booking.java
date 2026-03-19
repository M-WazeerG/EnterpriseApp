package za.ac.cput.domain;

import java.time.LocalDate;

public class Booking {

    private int bookingNumber;
    private LocalDate bookingDate;
    private String bookingParticipants;
    private boolean pickupRequired;

    public Booking() {
    }
    // Private constructor (Builder only)
    private Booking(Builder builder) {
        this.bookingNumber = builder.bookingNumber;
        this.bookingDate = builder.bookingDate;
        this.bookingParticipants = builder.bookingParticipants;
        this.pickupRequired = builder.pickupRequired;
    }

    // Getters
    public int getBookingNumber() {
        return bookingNumber;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public String getBookingParticipants() {
        return bookingParticipants;
    }

    public boolean isPickupRequired() {
        return pickupRequired;
    }

    // Builder Class
    public static class Builder {
        private int bookingNumber;
        private LocalDate bookingDate;
        private String bookingParticipants;
        private boolean pickupRequired;

        public Builder setBookingNumber(int bookingNumber) {
            this.bookingNumber = bookingNumber;
            return this;
        }

        public Builder setBookingDate(LocalDate bookingDate) {
            this.bookingDate = bookingDate;
            return this;
        }

        public Builder setBookingParticipants(String bookingParticipants) {
            this.bookingParticipants = bookingParticipants;
            return this;
        }

        public Builder setPickupRequired(boolean pickupRequired) {
            this.pickupRequired = pickupRequired;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

    // toString
    @Override
    public String toString() {
        return "Booking{" +
                "bookingNumber=" + bookingNumber +
                ", bookingDate=" + bookingDate +
                ", bookingParticipants='" + bookingParticipants + '\'' +
                ", pickupRequired=" + pickupRequired +
                '}';
    }
}