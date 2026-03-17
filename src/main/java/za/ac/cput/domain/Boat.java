/*
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
*/

package za.ac.cput.domain;

import java.time.LocalDate;

public class Boat {
    private String boatNumber;
    private String boatName;
    private int capacity;
    private LocalDate tripDate;

    private Boat() {
    }

    public Boat(Builder builder) {
        this.boatNumber = builder.boatNumber;
        this.boatName = builder.boatName;
        this.capacity = builder.capacity;
        this.tripDate = builder.tripDate;
    }

    public String getBoatNumber() {
        return boatNumber;
    }

    public String getBoatName() {
        return boatName;
    }

    public int getCapacity() {
        return capacity;
    }

    public LocalDate getTripDate() {
        return tripDate;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "boatNumber='" + boatNumber + '\'' +
                ", boatName='" + boatName + '\'' +
                ", capacity=" + capacity +
                ", tripDate=" + tripDate +
                '}';
    }

    public static class Builder {
        private String boatNumber;
        private String boatName;
        private int capacity;
        private LocalDate tripDate;

        public Builder setBoatNumber(String boatNumber) {
            this.boatNumber = boatNumber;
            return this;
        }

        public Builder setBoatName(String boatName) {
            this.boatName = boatName;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setTripDate(LocalDate tripDate) {
            this.tripDate = tripDate;
            return this;
        }

        public Builder copy(Boat boat) {
            this.boatNumber = boat.boatNumber;
            this.boatName = boat.boatName;
            this.capacity = boat.capacity;
            this.tripDate = boat.tripDate;
            return this;
        }

        public Boat build() {
            return new Boat(this);
        }
    }
}