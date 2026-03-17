package za.ac.cput.factory;

import za.ac.cput.domain.Equipment;

public class EquipmetFactory {

    public static Equipment createEquipment(String equipmentNumber, String equipmentName, String condition, int onHand){

        return new Equipment.Builder().setEquipmentNumber(equipmentNumber)
                .setEquipmentName(equipmentName)
                .setCondition(condition)
                .setOnHand(onHand).build();

    }

}
