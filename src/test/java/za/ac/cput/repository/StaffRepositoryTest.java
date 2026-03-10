package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Staff;
import za.ac.cput.factory.StaffFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StaffRepositoryTest {

    private static IStaffRepository repository = StaffRepository.getRepository();
    private static Staff staff = StaffFactory.createStaff("240453182", "Yaseen","Kannemeyer","0712345678","240453182@mycput.ac.za","Employee");

    @Test
    void a_create() {
        Staff created = repository.create(staff);
        assertNotNull(created);
        System.out.println("Staff created: " + created);
    }

    @Test
    void b_read() {
        Staff read = repository.read(staff.getStaffNumber());
        assertEquals(staff.getStaffNumber(), read.getStaffNumber());
        System.out.println("Staff read: " + read);
    }

    @Test
    void c_update() {
        Staff newStaff = new Staff.Builder().copy(staff)
                .setFirstName("Terry")
                .build();
        Staff updated = repository.update(newStaff);
        assertNotNull(updated);
        System.out.println("Staff updated: " + updated);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean deleted = repository.delete(staff.getStaffNumber());
        assertTrue(deleted);
        System.out.println("Staff deleted: " + deleted);
    }

    @Test
    void e_getAll() {
        List<Staff> employees = repository.getAll();
        System.out.println("Staff list" + employees);

    }
}