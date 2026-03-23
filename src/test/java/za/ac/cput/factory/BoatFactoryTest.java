/*
BoatFactoryTest.java
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
Date: 17 March 2026
*/

package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Boat;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BoatFactoryTest {
    private static Boat b1, b2;

    @BeforeEach
    void setup() {
        // Valid boat
        b1 = BoatFactory.createBoat("B001", "Sea Explorer", 20, LocalDate.of(2026, 3, 20));
        // Invalid boat (capacity negative, should fail)
        b2 = BoatFactory.createBoat("", "Ocean Rider", -5, null);
    }

    @Test
    void a_testBoat() {
        assertNotNull(b1);
        System.out.println(b1.toString());
    }

    @Test
    void b_testBoatThatFails() {
        assertNull(b2);
        System.out.println(b2.toString());
    }
}