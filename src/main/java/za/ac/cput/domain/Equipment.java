/*
Author: Kaole Kgothatso Junior
Student No: 231285302
*/

package za.ac.cput.domain;


public class Equipment {

    private String equipmentNumber;
    private String  equipmentName;
    private String condition;
    private int onHand;


    //builder method
    public Equipment (Builder builder){

        this.equipmentNumber= builder.equipmentNumber;
        this.equipmentName= builder.equipmentName;
        this.condition= builder.condition;
        this.onHand= builder.onHand;
    }


    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public String getCondition() {
        return condition;
    }

    public int getOnHand() {
        return onHand;
    }

    @Override
    public String toString(){

        return  "equipmentNumber: " + equipmentNumber
                + " equipmentName: " + equipmentName
                + " Condition: " + condition
                + " onHand: " + onHand ;
    }

    public static class Builder{
        private String equipmentNumber;
        private String  equipmentName;
        private String condition;
        private int onHand;

        public Builder setEquipmentNumber(String equipmentNumber){
            this.equipmentNumber=equipmentNumber;
            return this;

        }

        public Builder setEquipmentName(String equipmentName){
            this.equipmentName=equipmentName;
            return this;

        }

        public Builder setCondition(String condition){
            this.condition=condition;
            return this;
        }
        public Builder setOnHand(int onHand){
            this.onHand=onHand;
            return this;
        }

        public Builder copy(Equipment equipment){

            this.equipmentNumber = equipment.equipmentNumber;
            this.equipmentName = equipment.equipmentName;
            this.onHand = equipment.onHand;
            this.condition = equipment.condition;

            return this;
        }

        public Equipment build (){
            return new Equipment(this);
        }



    }
}
