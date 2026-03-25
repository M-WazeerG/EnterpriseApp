/* Author: Kaole Kgothatso Junior
    Student No: 231285302
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Equipment;

import java.util.List;

public interface IEquipmentRepository extends IRepository <Equipment, String> {

    List <Equipment> getAll();
}
