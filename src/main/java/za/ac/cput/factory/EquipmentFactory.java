/* Kaole Junior Kgothatso
231285302
 */

package za.ac.cput.factory;

import za.ac.cput.domain.Equipment;
import za.ac.cput.util.Helper;

public class EquipmentFactory {

    public static Equipment createEquipment(String equipmentNumber, String equipmentName, String condition, int onHand){

        if (Helper.isNullOrEmpty(equipmentNumber) || Helper.isNullOrEmpty(equipmentName))
            return null;

        return new Equipment.Builder().setEquipmentNumber(equipmentNumber)
                .setEquipmentName(equipmentName)
                .setCondition(condition)
                .setOnHand(onHand)
                .build();

    }



}
