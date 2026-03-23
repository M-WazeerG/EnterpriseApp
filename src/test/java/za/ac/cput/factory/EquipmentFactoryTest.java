package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Equipment;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EquipmentFactoryTest {

    @Test
    void createEquipment(){

        Equipment equipment= EquipmentFactory.createEquipment(

                " E01 ",
                " Swimsuit ",
                " Good ",
                10);

        assertNotNull(equipment);
        System.out.println(equipment);

    }
}
