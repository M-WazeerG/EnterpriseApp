/*
Author: Hlabela Tshegofatso Emeritus
Student No: 22275016
*/


package za.ac.cput.factory;

import za.ac.cput.domain.Transport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransportFactoryTest {

    @Test
    void createTransport_validInputs_success() {
        Transport transport = TransportFactory.createTransport("T001", "123 Main St", "Van", "John Doe");
        assertNotNull(transport);
        assertEquals("T001", transport.getTransportNumber());
        assertEquals("123 Main St", transport.getPickupLocation());
        assertEquals("Van", transport.getVehicleType());
        assertEquals("John Doe", transport.getDriverName());
    }

    @Test
    void createTransport_nullNumber_throws() {
        assertThrows(IllegalArgumentException.class, () ->
                TransportFactory.createTransport(null, "Location", "Van", "Driver"));
    }

    @Test
    void createTransport_emptyLocation_throws() {
        assertThrows(IllegalArgumentException.class, () ->
                TransportFactory.createTransport("T001", "", "Van", "Driver"));
    }

    @Test
    void createTransport_nullVehicleType_throws() {
        assertThrows(IllegalArgumentException.class, () ->
                TransportFactory.createTransport("T001", "Location", null, "Driver"));
    }

    @Test
    void createTransport_emptyDriverName_throws() {
        assertThrows(IllegalArgumentException.class, () ->
                TransportFactory.createTransport("T001", "Location", "Van", ""));
    }
}