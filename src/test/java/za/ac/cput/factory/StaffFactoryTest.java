/*
Author: Mogamat Yaseen Kannemeyer
Student No: 240453182
*/

package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Staff;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class StaffFactoryTest {
    private static Staff s1, s2;

    @BeforeEach
    void setup(){
        s1 = StaffFactory.createStaff("240453182", "Yaseen","Kannemeyer","0712345678","240453182@mycput.ac.za","Employee");
        s2 = StaffFactory.createStaff("135789","Terry","Rademeyer","trademeyermycpute.ac.za","0712345678","Manager");
    }

    @Test
    void a_testStaff() {
        assertNotNull(s1);
        System.out.println(s1.toString());
    }

    @Test
    void b_testStaffThatFails() {
        assertNotNull(s2);
        System.out.println(s2.toString());
    }
}