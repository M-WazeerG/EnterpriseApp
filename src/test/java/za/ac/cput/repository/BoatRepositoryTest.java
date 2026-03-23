/*
BoatRepository.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 17 March 2026
*/

package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Boat;
import za.ac.cput.factory.BoatFactory;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BoatRepositoryTest {

    private static IBoatRepository repository = BoatRepository.getRepository();
    private static Boat boat = BoatFactory.createBoat("B001", "Sea Explorer", 20, LocalDate.of(2026, 3, 20));

    @Test
    void a_create() {
        Boat created = repository.create(boat);
        assertNotNull(created);
        System.out.println("Boat created: " + created);
    }

    @Test
    void b_read() {
        Boat read = repository.read(boat.getBoatNumber());
        assertEquals(boat.getBoatNumber(), read.getBoatNumber());
        System.out.println("Boat read: " + read);
    }

    @Test
    void c_update() {
        Boat newBoat = new Boat.Builder().copy(boat)
                .setBoatName("Ocean Rider")
                .setCapacity(25)
                .build();
        Boat updated = repository.update(newBoat);
        assertNotNull(updated);
        System.out.println("Boat updated: " + updated);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete(boat.getBoatNumber());
        assertTrue(deleted);
        System.out.println("Boat deleted: " + deleted);
    }

    @Test
    void e_getAll() {
        List<Boat> boats = repository.getAll();
        System.out.println("Boat list: " + boats);
    }
}