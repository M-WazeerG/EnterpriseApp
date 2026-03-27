/*
Author: Hlabela Tshegofatso Emeritus
Student No: 22275016
*/

package za.ac.cput.factory;

import za.ac.cput.domain.Transport;

public class TransportFactory {
    public static Transport createTransport(String transportNumber, String pickupLocation,
                                            String vehicleType, String driverName) {
        if (transportNumber == null || transportNumber.trim().isEmpty())
            throw new IllegalArgumentException("Transport number is required");
        if (pickupLocation == null || pickupLocation.trim().isEmpty())
            throw new IllegalArgumentException("Pickup location is required");
        if (vehicleType == null || vehicleType.trim().isEmpty())
            throw new IllegalArgumentException("Vehicle type is required");
        if (driverName == null || driverName.trim().isEmpty())
            throw new IllegalArgumentException("Driver name is required");

        return new Transport.Builder()
                .setTransportNumber(transportNumber)
                .setPickupLocation(pickupLocation)
                .setVehicleType(vehicleType)
                .setDriverName(driverName)
                .build();
    }
}