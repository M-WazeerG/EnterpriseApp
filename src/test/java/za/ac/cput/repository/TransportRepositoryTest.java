/*
Author: Hlabela Tshegofatso Emeritus
Student No: 22275016
*/


package za.ac.cput.repository;

import za.ac.cput.domain.Transport;
import za.ac.cput.factory.TransportFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TransportRepositoryTest {
    private ITransportRepository repository;

    @BeforeEach
    void setUp() {
        repository = TransportRepository.getRepository();
        repository.getAll().clear();
    }

    @Test
    void create_success() {
        Transport transport = TransportFactory.createTransport("T001", "123 Main St", "Van", "John Doe");
        Transport created = repository.create(transport);
        assertNotNull(created);
        assertEquals(transport, created);
    }

    @Test
    void create_duplicate_fails() {
        Transport transport = TransportFactory.createTransport("T001", "123 Main St", "Van", "John Doe");
        repository.create(transport);
        Transport duplicate = repository.create(transport);
        assertNull(duplicate);
    }

    @Test
    void read_existing_returns() {
        Transport transport = TransportFactory.createTransport("T001", "123 Main St", "Van", "John Doe");
        repository.create(transport);
        Transport found = repository.read("T001");
        assertNotNull(found);
        assertEquals(transport, found);
    }

    @Test
    void read_nonExisting_returnsNull() {
        Transport found = repository.read("NON_EXISTENT");
        assertNull(found);
    }

    @Test
    void update_existing_success() {
        Transport original = TransportFactory.createTransport("T001", "123 Main St", "Van", "John Doe");
        repository.create(original);
        Transport updated = TransportFactory.createTransport("T001", "456 Elm St", "Bus", "Jane Smith");
        Transport result = repository.update(updated);
        assertNotNull(result);
        assertEquals(updated, result);
        assertEquals("456 Elm St", repository.read("T001").getPickupLocation());
        assertEquals("Bus", repository.read("T001").getVehicleType());
    }

    @Test
    void update_nonExisting_returnsNull() {
        Transport transport = TransportFactory.createTransport("T001", "123 Main St", "Van", "John Doe");
        Transport result = repository.update(transport);
        assertNull(result);
    }

    @Test
    void delete_existing_success() {
        Transport transport = TransportFactory.createTransport("T001", "123 Main St", "Van", "John Doe");
        repository.create(transport);
        assertTrue(repository.delete("T001"));
        assertNull(repository.read("T001"));
    }

    @Test
    void delete_nonExisting_returnsFalse() {
        assertFalse(repository.delete("NON_EXISTENT"));
    }

    @Test
    void getAll_returnsAll() {
        Transport t1 = TransportFactory.createTransport("T001", "123 Main St", "Van", "John Doe");
        Transport t2 = TransportFactory.createTransport("T002", "789 Oak St", "Car", "Alice Brown");
        repository.create(t1);
        repository.create(t2);
        List<Transport> list = repository.getAll();
        assertEquals(2, list.size());
        assertTrue(list.contains(t1));
        assertTrue(list.contains(t2));
    }
}
