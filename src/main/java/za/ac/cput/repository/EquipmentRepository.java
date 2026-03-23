package za.ac.cput.repository;

import za.ac.cput.domain.Equipment;
import java.util.ArrayList;
import java.util.List;

public class EquipmentRepository implements IEquipmentRepository{


    private static IEquipmentRepository repository = null;
    private List<Equipment> equipmentList;
     private EquipmentRepository (){

         equipmentList = new ArrayList<>();
     }

     public static IEquipmentRepository getRepository(){

         if (repository == null){
             repository = new EquipmentRepository();
         }
         return repository;

     }

     @Override

     public Equipment create(Equipment equipment){

         boolean success = equipmentList.add(equipment);
         if (success){
             return equipment;
         }
         return null;
     }

     @Override
    public Equipment read(String equipmentNumber){

         Equipment read = equipmentList.stream()
                 .filter(equipment -> equipment.getEquipmentNumber().equals(equipmentNumber))
                         .findFirst()
                         .orElse(null);

                 return read;
     }

     @Override
    public Equipment update(Equipment equipment){

         String id = equipment.getEquipmentNumber();
         Equipment oldEquipment = read(id);

         if (oldEquipment != null) {
             if (equipmentList.remove(oldEquipment)) {
                 if (equipmentList.add(equipment)){

                     return equipment;
                 }
             }
         }
         return null;
     }

     @Override
    public boolean delete(String id){
         Equipment equipmentToDelete = read(id);

         if (equipmentToDelete==null){

             return false;
         }
         return (equipmentList.remove(equipmentToDelete));

     }

     @Override
    public List<Equipment> getAll(){
         return equipmentList;
     }


}
