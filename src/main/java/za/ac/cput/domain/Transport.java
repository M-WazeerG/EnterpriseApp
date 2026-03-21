/*
Author: Hlabela Tshegofatso Emeritus
Student No: 22275016
*/




package za.ac.cput.domain;

import java.util.Objects;

public class Transport {
    private final String transportNumber;
    private final String pickupLocation;
    private final String vehicleType;
    private final String driverName;

    private Transport(Builder builder) {
        this.transportNumber = builder.transportNumber;
        this.pickupLocation = builder.pickupLocation;
        this.vehicleType = builder.vehicleType;
        this.driverName = builder.driverName;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getDriverName() {
        return driverName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(transportNumber, transport.transportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportNumber);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transportNumber='" + transportNumber + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", driverName='" + driverName + '\'' +
                '}';
    }

    public static class Builder {
        private String transportNumber;
        private String pickupLocation;
        private String vehicleType;
        private String driverName;

        public Builder setTransportNumber(String transportNumber) {
            this.transportNumber = transportNumber;
            return this;
        }

        public Builder setPickupLocation(String pickupLocation) {
            this.pickupLocation = pickupLocation;
            return this;
        }

        public Builder setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }

        public Builder setDriverName(String driverName) {
            this.driverName = driverName;
            return this;
        }

        public Transport build() {
            return new Transport(this);
        }
    }
}