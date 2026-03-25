/* Author: Kaole Kgothatso Junior
    Student No: 231285302
*/

package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Equipment;
import za.ac.cput.factory.EquipmentFactory;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class EquipmentRepositoryTest {

    private static IEquipmentRepository repository = EquipmentRepository.getRepository();
    private static Equipment equipment = EquipmentFactory.createEquipment(

            " E01 ",
            " Mask ",
            " Good ",
            10
    );

    @Test
    void a_create() {
        Equipment created = repository.create(equipment);
        assertNotNull(created);
        System.out.println(" Equipment created: " + created);
    }

    @Test
    void b_read(){

        Equipment read = repository.read(equipment.getEquipmentNumber());
        assertEquals(equipment.getEquipmentNumber(), read.getEquipmentNumber() );
        System.out.println(" Read Equipment " + read);

    }

    @Test
    void c_update(){
        Equipment newEquipment = new Equipment.Builder().copy(equipment)
                .setEquipmentName(" fins ")
                .setOnHand(20)
                .build();
        Equipment  updated = repository.update(newEquipment);
        assertNotNull(updated);
        System.out.println(" Equipment Update: " + updated);

    }

    @Test
    @Disabled
    void d_delete(){

        boolean deleted = repository.delete(equipment.getEquipmentNumber());
        assertTrue(deleted);
        System.out.println("Equipment deleted: " + deleted);
    }

    @Test
    void e_getAll(){
        List<Equipment> equipmentList = repository.getAll();
        System.out.println("Equipment List: " + equipmentList);
    }



}
